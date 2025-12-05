package modelo;

import java.util.ArrayList;

public class Computadora {
    
    private String marca;
    private double precio;
    private Procesador procesador;
    private ArrayList<Monitor> monitores;
    
    public Computadora() {
        
        procesador  = new Procesador();
        monitores = new ArrayList<>();
    }
    
    public Computadora(String marca, double precio, double frecuencia, int numNucleos) {
        
        this.marca = marca;
        this.precio = precio;
        procesador = new Procesador(frecuencia, numNucleos);
        monitores = new ArrayList<>();
        
    }
    
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    @Override
    public String toString() {
        return "Computadora\n Marca: " + marca + ", Precio: "+ precio + "\n" + procesador.toString() + "\n" + monitores;
    }
    
    public void agregarMonitor(Monitor monitor) {
        
        monitores.add(monitor);
        
    }
}
