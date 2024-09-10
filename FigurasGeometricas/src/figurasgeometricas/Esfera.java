/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricas;

public class Esfera extends FiguraGeometrica{
    private double radio;
    
    public Esfera(double radio) {
        this.radio = radio;
        this.setVolumen(calcularVol()); 
        this.setSuperficie(calcularSuper()); 
    }
    
    public double calcularVol() {
        double volumen = Math.pow(this.radio, 3)*Math.PI*(4.00/3.00);
        return volumen;
    }

    public double calcularSuper() {
        double superficie = 4*Math.PI*Math.pow(this.radio, 2);
        return superficie;
    }
    
}
