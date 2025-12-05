/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 * @author emmanems
 */
public class MainTransporte {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
  
    MedioTransporte t1 = new Bicicleta(); 

    t1.frenar();
    t1 = new Automovil();
    t1.frenar();

  }
}
