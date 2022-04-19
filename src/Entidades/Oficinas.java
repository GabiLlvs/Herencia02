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
public class Oficinas extends Edificio {

    private int num_oficinas;
    private int cant_per;
    private int cant_piso;

    public Oficinas() {
    }

    public Oficinas(int num_oficinas, int cant_per, int cant_piso, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.num_oficinas = num_oficinas;
        this.cant_per = cant_per;
        this.cant_piso = cant_piso;
    }

//    public void cantPersonas() {
//        Oficinas off = new Oficinas();
//        off.setCant_per(50);
//        off.setCant_piso(7);
//        off.setNum_oficinas(7);
//        off.setAlto(25d);
//        off.setAncho(46d);
//        off.setLargo(30d);
//
//        System.out.println("Ancho = " + off.getAncho());
//        System.out.println("Alto = " + off.getAlto());
//        System.out.println("Largo = " + off.getLargo());
//
//        System.out.println("El establecimiento tiene " + off.getCant_piso() + " pisos");
//        System.out.println("Tiene " + off.getNum_oficinas() + " oficinas");
//        System.out.println("En el establecimiento entran " + off.getCant_per());
//        calcularSuperficie();
//        //crear segunda oficina
//    }

//    public void crearOffice() {
////        cantPersonas();
////        calcularSuperficie();
////        calcularVolumen();
//    }
//
    @Override
    public void calcularSuperficie(Double largo, Double ancho) {
        //largo x ancho\\
        System.out.println(largo);
        double sup = (largo * ancho);
        System.out.println("Superficie = " + sup);
    }
//
    @Override
    public void calcularVolumen(Double ancho, Double largo, Double alto) {
        double vol = ancho * largo * alto;
        System.out.println("Volumen = " + vol);
    }

    public int getNum_oficinas() {
        return num_oficinas;
    }

    public int getCant_per() {
        return cant_per;
    }

    public int getCant_piso() {
        return cant_piso;
    }

    public void setNum_oficinas(int num_oficinas) {
        this.num_oficinas = num_oficinas;
    }

    public void setCant_per(int cant_per) {
        this.cant_per = cant_per;
    }

    public void setCant_piso(int cant_piso) {
        this.cant_piso = cant_piso;
    }

    @Override
    public void calcularSuperficie() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void calcularVolumen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
