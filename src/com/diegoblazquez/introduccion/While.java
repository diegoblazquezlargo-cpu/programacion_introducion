package com.diegoblazquez.introduccion;
public class While {
    static void imprimirresultados(int victorias, int empates, int derrotas) {
        while(victorias > 0){
            System.out.println("He ganado un partido");
            victorias--;
        }
        while(empates> 0){
            System.out.println("He empatado un partido");
            empates--;
        }
        while(derrotas>0){
            System.out.println("He perdido un partido");
            derrotas--;
        }
    }
    public static void main(String[] args) {
        System.out.println("Vamos a imprimir los resultados de la Seleccion Española");
        imprimirresultados(3, 3, 4);
        System.out.println("Vamos a imprimir los resultados de la mejor liga del mundo la premier league");
        imprimirresultados(9, 1, 0);
        
    }
    
}
