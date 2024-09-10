/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricas;

/**
 *
 * @author srome
 */
public class Prisma extends FiguraGeometrica{
    private double base;
    private double altura;
    
    public Prisma(double base, double altura){
        this.base = base;
        this.altura = altura;
        this.setVolumen(calcularVol());
        this.setSuperficie(calcularSuper()); 
    }
    
    public double calcularVol() {
        double volumen = (Math.sqrt(3)/4)*Math.pow(base, 2)*altura;
        return volumen;
    }

    public double calcularSuper() {
        double superficie = ((Math.sqrt(3)/4)*Math.pow(base, 2)*2.00)+(altura*base*3.00);
        return superficie; 
    }
}
