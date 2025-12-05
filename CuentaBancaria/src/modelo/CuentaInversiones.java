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
public class CuentaInversiones extends Cuenta{
  private double ganancia;    

  public CuentaInversiones() {
    super();
  }

  public CuentaInversiones(String cliente, String numCuenta, double saldo, double ganancia) {
    super(cliente, numCuenta, saldo);
    this.ganancia = ganancia;
  }

  public double getGanancia() {
    return ganancia;
  }

  public void setGanancia(double ganancia) {
    this.ganancia = ganancia;
  }
  
  @Override
  public void depositar(double cantidad) {

    double porcentaje = ganancia / 100; 
    super.setSaldo(super.getSaldo() + (cantidad * (porcentaje + 1))); 
  }
}
