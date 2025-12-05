package vista;

import modelo.Planeta;

public class Main {
  
  public static void main(String[] args) {
    
    final String SPACE = "         ";

    Planeta planeta1 = new Planeta("Tierra", 5.97336e24, 1, 12742, 1.08321e12, "terrestre", 1.5e8, 24);
    Planeta planeta2 = new Planeta("Marte", 6.39e23, 2, 6779, 1.6318e11, "terrestre", 2.28e8, 24.39);
    Planeta planeta3 = new Planeta("Jupiter", 1.899e27, 95, 139820, 1.4313e15, "gigante", 7.5e8, 10);
    
    System.out.println(planeta1); 
    System.out.println(SPACE + "Densidad del planeta: " + planeta1.calcularDensidad());
    System.out.println(SPACE + "Gravedad de la Superficie: " + planeta1.calcularGravedad());
    System.out.println(SPACE + "Periodo Orbital: " + planeta1.calcularPeriodo());
    System.out.println(SPACE + planeta1.determinarExterior());
    System.out.println(SPACE + planeta1.determinarSimilitud(planeta2));
    
    System.out.println(planeta2); 
    System.out.println(SPACE + "Densidad del planeta: " + planeta2.calcularDensidad());
    System.out.println(SPACE + "Gravedad de la Superficie: " + planeta2.calcularGravedad());
    System.out.println(SPACE + "Periodo Orbital: " + planeta2.calcularPeriodo());
    System.out.println(SPACE + planeta2.determinarExterior());
    System.out.println(SPACE + planeta2.determinarSimilitud(planeta3));
    
    System.out.println(planeta3); 
    System.out.println(SPACE + "Densidad del planeta: " + planeta3.calcularDensidad());
    System.out.println(SPACE + "Gravedad de la Superficie: " + planeta3.calcularGravedad());
    System.out.println(SPACE + "Periodo Orbital: " + planeta3.calcularPeriodo());
    System.out.println(SPACE + planeta3.determinarExterior());
    System.out.println(SPACE + planeta3.determinarSimilitud(planeta1));
  }

}
