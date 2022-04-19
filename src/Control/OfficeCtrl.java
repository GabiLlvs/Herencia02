/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Entidades.Oficinas;

/**
 *
 * @author gabri
 */
public class OfficeCtrl {

    Oficinas off = new Oficinas();

    public void crearOffice() {
        cantPersonas();
        off.calcularSuperficie(off.getLargo(), off.getAncho());
//        calcularSuperficie();
        off.calcularVolumen(off.getAncho(), off.getLargo(), off.getAlto());
//        calcularVolumen();
    }

    public void cantPersonas() {

        off.setCant_per(50);
        off.setCant_piso(7);
        off.setNum_oficinas(7);
        off.setAlto(25d);
        off.setAncho(46d);
        off.setLargo(30d);

        System.out.println("Ancho = " + off.getAncho());
        System.out.println("Alto = " + off.getAlto());
        System.out.println("Largo = " + off.getLargo());

        System.out.println("El establecimiento tiene " + off.getCant_piso() + " pisos");
        System.out.println("Tiene " + off.getNum_oficinas() + " oficinas");
        System.out.println("En el establecimiento entran " + off.getCant_per());

        //crear segunda oficina
    }

//    public void calcularSuperficie() {
//        //largo x ancho\\
//        System.out.println(off.getLargo());
//        double sup = (off.getLargo() * off.getAncho());
//        System.out.println("Superficie = " + sup);
//    }
//
//    public void calcularVolumen() {
//        double vol = off.getAncho() * off.getLargo() * off.getAlto();
//        System.out.println("Volumen = " + vol);
//    }
}
