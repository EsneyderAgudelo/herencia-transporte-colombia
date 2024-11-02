package com.example;

public class TransportePublico {
    protected String tipo;
    protected String ruta;
    protected double tarifa;
    protected double distanciaRecorrida;
    protected int tiempoRecorrido;

    public TransportePublico(String tipo, String ruta) {
        this.tipo = tipo;
        this.ruta = ruta;
    }

    
    public double calcularTarifa() {
        return this.tarifa;
    }

    public double calcularDistanciaRecorrida() {
        return this.distanciaRecorrida;
    }

    public int calcularTiempoRecorrido() {
        return this.tiempoRecorrido;
    }
}
