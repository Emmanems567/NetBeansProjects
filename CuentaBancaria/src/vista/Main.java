/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import modelo.Cuenta;
import modelo.CuentaInversiones;
import modelo.CuentaNomina;

/**
 *
 * @author emmanems
 */
public class Main {
  
  public static void main(String[] args) {
    
    Cuenta c1 = new Cuenta("Ramiro", "2222", 100);
    CuentaInversiones c2 = new CuentaInversiones("Patricia", "1234", 500, 3);
    CuentaNomina c3 = new CuentaNomina("Ana", "1111", 1000, 3);
   
    c1.depositar(100);
    c1.retirar(500);
    System.out.println(c1.consultar());

    c2.depositar(100);
    System.out.println(c2.consultar());

    c3.depositar(100);
    c3.retirar(100);
    System.out.println(c3.consultar());

  }    
}
