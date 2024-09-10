/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricas;

public class Piramide extends FiguraGeometrica{
    private double base;
    private double altura;
    private double apotema; 
    
    public Piramide(double base, double altura, double apotema) {
        this.base = base;
        this.altura = altura;
        this.apotema = apotema;
        this.setVolumen(calcularVol());
        this.setSuperficie(calcularSuper()); 
    }
    
    public double calcularVol() {
        double volumen = (Math.pow(base, 2)*altura)/3;
        return volumen;
    }

    public double calcularSuper() {
        double areaBase = Math.pow(base, 2);
        double areaLado = 2*base*apotema;
        return areaBase + areaLado; 
    }
    
}
