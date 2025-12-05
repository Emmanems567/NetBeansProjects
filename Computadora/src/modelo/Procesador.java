/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Alumno21
 */
public class Procesador {
    
    private double frecuencia;
    private int numNucleos;
    
    public Procesador() {
        
    }
    
    public Procesador(double frecuencia, int numNucleos) {
        this.frecuencia = frecuencia;
        this.numNucleos = numNucleos;
    }
    
    public double getFrecuencia() {
        return frecuencia;
    }
    
    public void setFrecuencia(double frecuencia) {
        this.frecuencia = frecuencia;
    }
    
    public int getNumNucleos() {
        return numNucleos;
    }
    
    public void setNumNucleos(int numNucleos) {
        this.numNucleos = numNucleos;
    }
    
    @Override
    public String toString() {
        return "Frecuencia: " + frecuencia + ", Nucleos: " + numNucleos;
    }
    
}
