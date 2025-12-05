package modelo;

public class Consultor extends Empleado{
  private String nombreProyecto;

  public Consultor() {
    super();
  }

  public Consultor(String nombre, String numEmpleado, String categoria, String rfc, String nombreProyecto) {
    super(nombre, numEmpleado, categoria, rfc);
    this.nombreProyecto = nombreProyecto;
  }

  public String getNombreProyecto() {
      return nombreProyecto;
  }

  public void setNombreProyecto(String nombreProyecto) {
      this.nombreProyecto = nombreProyecto;
  }

  @Override
  public String crearRecibo(int dias, double costo) {
    return "Consultor Proyecto: " + nombreProyecto + ", " + super.crearRecibo(dias, costo);
  }
}
