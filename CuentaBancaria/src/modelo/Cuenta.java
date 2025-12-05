/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author emmanems
 */
public class Cuenta {
   
  private String cliente;
  private String numCuenta;
  private double saldo;

  public Cuenta() {

  }

  public Cuenta(String cliente, String numCuenta, double saldo) {
    this.cliente = cliente;
    this.numCuenta = numCuenta;
    this.saldo = saldo;
  }

  public String getCliente() {
    return cliente;
  }
  public void setCLiente(String cliente) {
    this.cliente = cliente;
  }

  public String getNumCuenta() {
    return numCuenta;
  } 

  public void setNumCuenta(String numCuenta) {
    this.numCuenta = numCuenta;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public void depositar(double cantidad) {
    
    if (cantidad > 0)
      saldo += cantidad;
    else
      System.out.println("La cantidad a depositar debe ser un numero positivo");
  }

  public void retirar(double cantidad) {
 
    if (cantidad > 0 && saldo > cantidad)
      saldo -= cantidad;
    else
      saldo = saldo;
  }

  public String consultar() {
    return "El saldo de la cuenta " + numCuenta + " es: " + saldo;
  } 


}
