package ClasificacionMascotasVeterinaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("--- Bienvenido al sistema de clasificacion de animales ---");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba el tipo de animal: ");
        String tipoAnimal = scanner.nextLine().toUpperCase();
        System.out.println("Escriba la edad del animal en años: ");
        int edadAnimal = scanner.nextInt();
        scanner.nextLine();
        scanner.close();

        switch (tipoAnimal) {
            case "PERRO":
                System.out.println("El veterinario que le corresponde es Canino");
                if(edadAnimal > 5) {
                    System.out.println("Se recomienda una vacunacion adicional!");
                }
                break;
            case "GATO":
                System.out.println("El veterinario que le corresponde es Felino");
                if(edadAnimal > 5) {
                    System.out.println("Se recomienda una vacunacion adicional!");
                }
                break;
            case "AVE":
                System.out.println("El veterinario que le corresponde es de animales exoticos.");
                break;
            case "OTRO":
                System.out.println("El veterinario que le corresponde es general");
                break;

        }

    }
}
