package AccesoParqueadero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double recargo = 1.20;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba el tipo de vehiculo(auto, moto, bicicleta): ");
        String tipoVehiculo = scanner.nextLine().toUpperCase();
        System.out.println("¿A qué hora ingresó el vehiculo?");
        System.out.println("Escriba la hora en formato 24 horas(0-23)");
        int horaIngreso = scanner.nextInt();
        double costo = 0;
        scanner.close();
        switch (tipoVehiculo) {
            case "AUTO":
                costo = 5000;
            break;
            case "MOTO":
                costo = 3000;
            break;
            case "BICICLETA":
                costo = 1000;
            break;
        }
        if (horaIngreso > 23 || horaIngreso < 0) {
            System.out.println("Hora de ingreso incorrecta!");
        } else if (horaIngreso > 20) {
            System.out.println("Aplica recargo nocturno para el vehiculo " + tipoVehiculo);
            costo *= recargo;
            System.out.println("El cobro de parqueo por hora sera: $" + costo + "pesos");
        }
    }
}
