/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author gabri
 */
public abstract class Edificio {
    protected double ancho;
    protected double alto;
    protected double largo;

    public Edificio() {
    }

    public Edificio(double ancho, double alto, double largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    
public abstract void calcularSuperficie(Double largo, Double ancho);
public abstract void calcularVolumen(Double ancho, Double largo, Double alto);
    
    
    @Override
    public String toString() {
        return "Edificio{" + "ancho=" + ancho + ", alto=" + alto + ", largo=" + largo + '}';
    }

    
    
    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }

    public double getLargo() {
        return largo;
    }

    
    
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }
    
    
    
}
