/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricas;

public class Cilindro extends FiguraGeometrica{
    private double radio;
    private double altura;
    
    public Cilindro(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
        this.setVolumen(calcularVol()); 
        this.setSuperficie(calcularSuper()); 
    }

    public double calcularVol() {
        double volumen = Math.PI * altura * Math.pow(radio, 2.0);
        return volumen;
    }

    public double calcularSuper() {
        double areaA = 2*Math.PI*radio*altura;
        double areaB = 2*Math.PI*Math.pow(radio, 2);
        return areaA + areaB;
    }
    
}
