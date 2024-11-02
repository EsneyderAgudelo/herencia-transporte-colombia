package com.example;

public class Bus extends TransportePublico {
    private int capacidad;

    public Bus(String ruta, int capacidad) {
        super("Bus", ruta);
        this.capacidad = capacidad;
    }

    public double calcularTarifaBus() {
        return this.tarifa = distanciaRecorrida * 0.5 + capacidad * 0.1;
    }

    public void mostrarInformacion() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Ruta: " + ruta);
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Tarifa: " + calcularTarifaBus());
        System.out.println("Distancia Recorrida: " + calcularDistanciaRecorrida());
        System.out.println("Tiempo Recorrido: " + calcularTiempoRecorrido());
    }
}

