import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de horas: ");
        double horas = input.nextDouble();
        double minutos = horas * 60;
        System.out.println(horas + " horas equivalen a " + minutos + " minutos.");
    }
}