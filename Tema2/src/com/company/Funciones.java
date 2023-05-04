package com.company;

public class Funciones {
    /**
     *
     * Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.
     */

    public static void main(String[] args) {

        System.out.println(Precio(89));
    }

    static double Precio (float precio){
        return precio + precio*0.21;
    }
}
