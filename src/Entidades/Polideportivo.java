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
public class Polideportivo extends Edificio {

    private String nombre;
    private boolean tipo;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, boolean tipo, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipo = tipo;
    }

    @Override
    public void calcularSuperficie(Double largo, Double ancho) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void calcularVolumen(Double ancho, Double largo, Double alto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

}
