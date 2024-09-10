
package com.mycompany.calificaciones;

public class Calculo_notas {
    
    double [] listaNotas; // lista de notas tipo double 
    
    public Calculo_notas() {
        listaNotas = new double[5]; //Crea una lista de notas de tamaño 5 
    }
    
    double calcularpromedio_notas(){
        double suma = 0;
        for(int i = 0; i < listaNotas.length;i++){
        suma = suma + listaNotas[i];
        }
    
        return (suma/listaNotas.length);
        //return listaNotas.length;
    }
    
    double calcularDesviación() {
        double prom = calcularpromedio_notas(); 
        double suma = 0;
        for(int i=0; i < listaNotas.length; i++) {

            suma += Math.pow(listaNotas[i] - prom, 2 );
        }
        return Math.sqrt (suma/listaNotas.length ); 
        }

    double calcularMenor() {
        double menor = listaNotas[0]; 
        for(int i=0; i < listaNotas.length; i++) { 
            if (listaNotas[i] < menor) {
   
            menor = listaNotas[i];
            }
        }   
    return menor;
        }

    double calcularMayor() {
        double mayor = listaNotas[0]; 
            for(int i=0; i < listaNotas.length; i++) { 
            if (listaNotas[i] > mayor) {
            mayor = listaNotas[i];
            }
        }
        return mayor;
    }
}
