package com.company;

public class SmartDevice {
    String marca;
    String color;
    int precio;

    public SmartDevice(){

    }

    public SmartDevice(String marca, String color, int precio) {
        this.marca = marca;
        this.color = color;
        this.precio = precio;
    }

    public static class SmartPhone extends SmartDevice {
        int nucleos;
        int ram;
        int almacenamiento;

        public SmartPhone() {
            super();
        }

        public SmartPhone(String marca, String color, int precio, int nucleos, int ram, int almacenamiento) {
            super(marca, color, precio);
            this.nucleos = nucleos;
            this.ram = ram;
            this.almacenamiento = almacenamiento;
        }

        @Override
        public String toString() {
            return "SmartPhone{" +
                    "nucleos=" + nucleos +
                    ", ram=" + ram +
                    ", almacenamiento=" + almacenamiento +
                    ", marca='" + marca + '\'' +
                    ", color='" + color + '\'' +
                    ", precio=" + precio +
                    '}';
        }
    }
    public static class SmartWatch extends SmartDevice{
        String sensores;
        int duraciónBateria;

        public SmartWatch() {
            super();
        }

        public SmartWatch(String marca, String color, int precio, String sensores, int duraciónBateria) {
            super(marca, color, precio);
            this.sensores = sensores;
            this.duraciónBateria = duraciónBateria;
        }

        @Override
        public String toString() {
            return "SmartWatch{" +
                    "sensores='" + sensores + '\'' +
                    ", duraciónBateria=" + duraciónBateria +
                    ", marca='" + marca + '\'' +
                    ", color='" + color + '\'' +
                    ", precio=" + precio +
                    '}';
        }
    }

    public static void main(String[] args) {
        SmartPhone smartphone = new SmartPhone("Motorola","blanco", 4500, 4, 2, 32);
        SmartWatch smartWatch = new SmartWatch("skmei","negro",500,"muchos",8);

        System.out.println( smartphone + "\n" + smartWatch);
    }
}
