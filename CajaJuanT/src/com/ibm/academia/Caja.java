package com.ibm.academia;

public class Caja
{
    private Integer ancho;
    private Integer alto;
    private Integer profundo;

    public Caja()
    {
    }

    public Caja(Integer ancho, Integer alto, Integer profundo)
    {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }

    public Integer getAncho()
    {
        return ancho;
    }

    public void setAncho(Integer ancho)
    {
        this.ancho = ancho;
    }

    public Integer getAlto()
    {
        return alto;
    }

    public void setAlto(Integer alto)
    {
        this.alto = alto;
    }

    public Integer getProfundo()
    {
        return profundo;
    }

    public void setProfundo(Integer profundo)
    {
        this.profundo = profundo;
    }

    @Override
    public String toString()
    {
        return "Caja{" +
                "ancho=" + ancho +
                ", alto=" + alto +
                ", profundo=" + profundo +
                '}';
    }

    /**
     * Metodo para calcular el volumen de un cubo
     * @param ancho Parametro del cubo
     * @param alto Parametro del cubo
     * @param profundo Parametro del cubo
     * @return Retorna el valor del volumen segun los parametros ingresados
     * @author JMTB - 11-04-2022
     */
    public static Integer calcularVolumen(Integer ancho, Integer alto, Integer profundo)
    {
        Integer volumen = 0;
        volumen = ancho * alto * profundo;
        System.out.println("El volumen del cubo es = " + volumen);
        return volumen;
    }
}
