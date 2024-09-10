package figurasgeometricas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author srome
 */
public class Cubo extends FiguraGeometrica{
    private double lado;
    
    public Cubo(double lado){
        this.lado = lado;
        this.setVolumen(calcularVol());
        this.setSuperficie(calcularSuper()); 
    }
    
    public double calcularVol() {
        double volumen = Math.pow(lado, 3);
        return volumen;
    }

    public double calcularSuper() {
        double superficie = 6*Math.pow(lado, 2);
        return superficie; 
    }
    
    
}
