package com.im.academia.test;

import com.ibm.academia.Caja;

public class CajaTest
{
    public static void main(String[] args)
    {
        final Integer ANCHO = 2;
        final Integer ALTO = 4;
        final Integer PROFUNDO = 3;

        Integer volumen = 0;

        Caja caja = new Caja();
        caja.setAncho(ANCHO);
        caja.setAlto(ALTO);
        caja.setProfundo(PROFUNDO);
        System.out.println("caja = " + caja);


        Caja.calcularVolumen(ANCHO, ALTO, PROFUNDO);




    }
}
