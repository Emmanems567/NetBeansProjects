/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import paquete1.MedioTransporte;

/**
 *
 * @author emmanems
 */
public class Bicicleta extends MedioTransporte{
  
  @Override
  public void frenar() {
    System.out.println("Frenando con el pie");
  }

}
