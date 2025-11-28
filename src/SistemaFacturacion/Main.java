package SistemaFacturacion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Bienvenido al sistema de factuación ---");
        Scanner scanner = new Scanner(System.in);
        double descuento = 1;
        System.out.println("Escriba el valor total de su compra: ");
        double valorCompra = scanner.nextDouble();
        System.out.println("Compra total por: $" + valorCompra);

        System.out.println("¿Cuántos productos compró?");
        int productosComprados = scanner.nextInt();

        System.out.println("¿Su merced tiene membresia?");
        System.out.println("Escriba Sí o No: ");
        scanner.nextLine();
        String membresiaActiva = scanner.nextLine().toUpperCase();

        System.out.println("--- Calculando el total ---");
        scanner.close();

        if (membresiaActiva.equals("SI") || membresiaActiva.equals("SÍ")) {
            System.out.println("--- Membresia activa ---");
            descuento -= 0.1;
        }
        if (productosComprados > 9) {
            descuento -= 0.05;
        }
        double totalCompra = valorCompra * descuento;
        System.out.println("El total de su compra es: " + totalCompra);
    }
}
