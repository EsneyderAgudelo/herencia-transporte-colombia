package com.example;

public class Transmilenio extends TransportePublico {
    private int numeroParadas;

    public Transmilenio(String ruta, int numeroParadas) {
        super("Transmilenio", ruta);
        this.numeroParadas = numeroParadas;
    }

    public double calcularTarifaTransmilenio() {
        return this.tarifa = numeroParadas * 1.5;
    }

    public void mostrarRuta() {
        System.out.println("La ruta del Transmilenio es: " + ruta + ", con " + numeroParadas + " paradas.");
    }
}

