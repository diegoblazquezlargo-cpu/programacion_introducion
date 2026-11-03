package com.diegoblazquez.introduccion;
class PenaFutbol {
    private String nombre;
    private int euros;

    PenaFutbol(String nombre) {
        this.nombre = nombre;
        this.euros = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEuros() {
        return euros;
    }

    public boolean ingresar(int euros) {
        if (euros != 5 && euros != 10 && euros != 20) {
            return false;
        }
        this.euros += euros;
        return true;
    }
}

public class POO2 {
    public static void main(String[] args) {
        PenaFutbol pena = new PenaFutbol("Peña Los Pellizcos");
        int[] cuotas = {10, 5, 7, 20, 10};

        for (int i = 0; i < cuotas.length; i++) {
            boolean aceptado = pena.ingresar(cuotas[i]);

            if (aceptado) {
                System.out.println("Cuota " + (i + 1) + ": +" + cuotas[i] + " euros, total " + pena.getEuros());
            } else {
                System.out.println("Cuota " + (i + 1) + ": billete falso (" + cuotas[i] + " euros), se ignora");
            }
        }

        System.out.println("Caja: " + pena.getNombre() + " con " + pena.getEuros() + " euros");
    }
}