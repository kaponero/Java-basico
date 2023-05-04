package com.company;

import java.util.Scanner;

public class Funciones {
    /**
     *
     * Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el precio");
        int precio = scanner.nextInt();

        System.out.println("El precio con IVA es: " + Precio(precio));
    }

    static double Precio (int precio){
        return precio + precio*0.21;
    }
}
