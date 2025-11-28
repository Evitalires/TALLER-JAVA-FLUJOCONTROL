package PromocionesTiendaRopa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double descuento = 1;
        double precioBase = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Qué tipo de prenda va comprar?");
        System.out.println("Ofrecemos: Camisa | Pantalon | Chaqueta");
        String tipoPrenda = scanner.nextLine().toUpperCase();
        System.out.println("¿Cuantas prendas va comprar?");
        int cantidadPrendas = scanner.nextInt();
        scanner.close();

        switch (tipoPrenda) {
            case "CAMISA":
                precioBase = 30000;
            break;
            case "PANTALON":
                precioBase = 30000;
            break;
            case "PANTALÓN":
                precioBase = 50000;
            break;
            case "CHAQUETA":
                precioBase = 80000;
            break;
        }
        double totalCompra = precioBase * cantidadPrendas;
        System.out.println("El total de su compra es: $" + totalCompra);
        if(cantidadPrendas > 5) {
            System.out.println("Al comprar mas de 5 unidades usted a ganado un descuento del 15%!!");
            descuento = 0.85;
            totalCompra *= descuento;
            System.out.println("El total de su compra es: $" + totalCompra);
        }
    }
}
