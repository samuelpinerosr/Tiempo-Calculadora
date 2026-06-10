import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 5) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Convertir horas a minutos");
            System.out.println("2. Convertir minutos a segundos");
            System.out.println("3. Convertir días a horas");
            System.out.println("4. Sumar minutos a una hora");
            System.out.println("5. Salir");
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();

            if (opcion == 1) {
                HorasAMinutos.main(null);
            } else if (opcion == 2) {
                MinutosASegundos.main(null);
            } else if (opcion == 3) {
                DiasAHoras.main(null);
            } else if (opcion == 4) {
                MinutosAHorasDadas.main(null);
            } else if (opcion == 5) {
                System.out.println("Programa terminado.");
            } else {
                System.out.println("Opción inválida.");
            }
        }

        sc.close();
    }
}


import java.util.Scanner;

public class MinutosAHorasDadas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int hora, minutos, minutosASumar;
        String formato;

        System.out.println("Vamos a sumar minutos a una hora dada");

        System.out.print("Ingresa la hora (solo la hora): ");
        hora = entrada.nextInt();

        System.out.print("Ingresa los minutos actuales: ");
        minutos = entrada.nextInt();

        System.out.print("Minutos a sumar: ");
        minutosASumar = entrada.nextInt();

        minutos = minutos + minutosASumar;
        hora = hora + (minutos / 60);
        minutos = minutos % 60;
        hora = hora % 24;

        entrada.nextLine(); // limpiar buffer
        System.out.print("¿Quieres ver la hora en formato militar (24h) o normal (12h)? ");
        formato = entrada.nextLine();

        if (formato.equalsIgnoreCase("normal")) {
            int horaNormal = hora % 12;
            if (horaNormal == 0) horaNormal = 12;
            String ampm = (hora < 12) ? "AM" : "PM";
            System.out.println("La nueva hora es: " + horaNormal + ":" + String.format("%02d", minutos) + " " + ampm);
        } else {
            System.out.println("La nueva hora es: " + String.format("%02d", hora) + ":" + String.format("%02d", minutos));
        }

        entrada.close();
    }
}
