package com.company;

public class Condicionales {
    public static void main(String[] args) {

        String[] nombres = {"Alvaro", "José", "Luis", "Labanca"};

        String nombreCompleto = "";
        for (String nombre: nombres){
            nombreCompleto += nombre + " ";
        }
        System.out.println(nombreCompleto);
    }
}
