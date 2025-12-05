package modelo;

public class PersonalSoporte extends Empleado{
  private String telefono;   

  public PersonalSoporte() {
    super();
  }
  
  public PersonalSoporte(String nombre, String numEmpleado, String categoria, String rfc, String telefono) {
    super(nombre, numEmpleado, categoria, rfc);
    this.telefono = telefono;
  }

  public String getTelefono() {
      return telefono;
  }

  public void setTelefono(String telefono) {
      this.telefono = telefono;
  }

  @Override
  public String crearRecibo(int dias, double costo) {
    return "Personal de Soporte Telefono: " + telefono + ", " + super.crearRecibo(dias, costo);
  }
}
