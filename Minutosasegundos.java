import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de minutos que desea convertir a segundos: ");
        double minutos = input.nextDouble();
        double segundos = minutos * 60;
        System.out.println( minutos + " minutos equivalen a " + segundos + "segundos.");
    }
}