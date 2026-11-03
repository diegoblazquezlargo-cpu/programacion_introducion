package com.diegoblazquez.introduccion;
class Pokemon {
    String nombredelaclase;
    int nivel;
    
    // Constructor
    Pokemon(String nombrequelepaso, int nivelquelepaso) {
        this.nombredelaclase = nombrequelepaso;
        this.nivel = nivelquelepaso; // Corrección: cambiado '-' por '='
    }
}

public class PrimerosPasosPokemon { // Corrección: quitamos el 'public
    public static void main(String[] args) {
        Pokemon charmanderdeash = new Pokemon("Charmander", 60);
        
        // Corrección: separamos el texto del número correctamente
        Pokemon charmandereralf = new Pokemon("Charmander", 99); 
        
        System.out.println(charmanderdeash.nombredelaclase);
        System.out.println(charmanderdeash.nivel);
        
        System.out.println(charmandereralf.nombredelaclase);
        // Corrección: escrito correctamente 'charmandereralf'
        System.out.println(charmandereralf.nivel); 
    }
}