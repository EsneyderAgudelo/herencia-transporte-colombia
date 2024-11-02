package com.example;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus("Ruta 1 Bus Urbano", 36);
        bus.distanciaRecorrida = 60.0;
        bus.tiempoRecorrido = 45;
        bus.mostrarInformacion();

        Metro metro = new Metro("Línea 2", 10);
        metro.distanciaRecorrida = 50.0;
        metro.tiempoRecorrido = 25;
        System.out.println("Tarifa Metro: " + metro.calcularTarifaMetro());
        metro.mostrarMapa();

        Transmilenio transmilenio = new Transmilenio("Ruta B con destino al Centro de la Ciudad", 13);
        transmilenio.distanciaRecorrida = 75;
        transmilenio.tiempoRecorrido = 35;
        System.out.println("Tarifa Transmilenio: " + transmilenio.calcularTarifaTransmilenio());
        transmilenio.mostrarRuta();
    }
}
