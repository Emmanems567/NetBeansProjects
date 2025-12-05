package modelo;

public class Empleado {

  private String nombre;
  private String numEmpleado;
  private String categoria;
  private String rfc;

  public Empleado() {}

  public Empleado(String nombre, String numEmpleado, String categoria, String rfc) {

    this.nombre = nombre;
    this.numEmpleado = numEmpleado;
    this.categoria = categoria;
    this.rfc = rfc;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getNumEmpleado() {
    return numEmpleado;
  }

  public void setNumEmpleado(String numEmpleado) {
    this.numEmpleado = numEmpleado;
  }

  public String getCategoria() {
    return categoria;
  }

  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

  public String getRfc() {
    return rfc;
  }

  public void setRfc(String rfc) {
    this.rfc = rfc;
  }

  public double calcularSalario(int dias, double costo) {
    return dias * costo;
  }

  public double calcularPercepcion(double salario) {
    return salario + 1200;
  }

  public double calcularIMSS(double percepcion) {
    return percepcion * 0.09;
  }

  public double calcularISR(double percepcion) {
    if (percepcion <= 4200) return percepcion * 0.05;
    else if (percepcion > 4200 && percepcion <= 8600) return percepcion * 0.10;
    else if (percepcion > 8600 && percepcion <= 15000) return percepcion * 0.15;
    else if (percepcion > 15000 && percepcion <= 30000) return percepcion * 0.20;
    else return percepcion * 0.30;
  }

  public double calcularDeducciones(double imss, double isr) {
    return imss + isr;
  }

  public double calcularTotal(double percepcion, double deducciones) {
    return percepcion - deducciones;
  }

  @Override
  public String toString() {
    return "Empleado (Nombre: "
        + nombre
        + ", Numero de empleado: "
        + numEmpleado
        + ", Categoria: "
        + categoria
        + ", RFC= "
        + rfc + ")";
  }

  public String crearRecibo(int dias, double costo) {
    double salario = calcularSalario(dias, costo);
    double percepcion = calcularPercepcion(salario);
    double imss = calcularIMSS(percepcion);
    double isr = calcularISR(percepcion);
    double deducciones = calcularDeducciones(imss, isr);
    double total = calcularTotal(percepcion, deducciones);

    return toString()
        + "\n\n    PERCEPCIONES                   DEDUCCIONES\n\nSalario :     "
        + salario
        + "         ISR:   "
        + isr
        + "\nBono    :     1200            IMSS:   "
        + imss
        + "\nTotal   :     "
        + percepcion
        + "         Total:    "
        + deducciones
        + "\nSueldo a percibir: "
        + total;
  }
}
