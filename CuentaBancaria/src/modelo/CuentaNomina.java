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
public class CuentaNomina extends Cuenta{
  private double comision;

  public CuentaNomina() {
    super();
  }

  public CuentaNomina(String cliente, String numCuenta, double saldo, double comision) {
    super(cliente, numCuenta, saldo);
    this.comision = comision;
  }

  public double getComision() {
    return comision;
  }

  public void setComision(double comision) {
    this.comision = comision;
  }
    
  @Override
  public void retirar(double cantidad) {

    super.setSaldo(super.getSaldo() - (cantidad + comision));

  }
}
