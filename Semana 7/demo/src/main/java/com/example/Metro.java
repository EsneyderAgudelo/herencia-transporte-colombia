package com.example;

public class Metro extends TransportePublico {
    private int numeroEstaciones;

    public Metro(String ruta, int numeroEstaciones) {
        super("Metro", ruta);
        this.numeroEstaciones = numeroEstaciones;
    }

    public double calcularTarifaMetro() {
        return this.tarifa = numeroEstaciones * 1.2;
    }

    public void mostrarMapa() {
        System.out.println("El metro se encuentra en: " + ruta);
    }
}

