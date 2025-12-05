package modelo;

public class Administrativo extends Empleado{
  private String email;

  public Administrativo() {

  }

  public Administrativo(String nombre, String numEmpleado, String categoria, String rfc, String email) {
    super(nombre, numEmpleado, categoria, rfc); 
    this.email = email;
  }

  public String getEmail() {
      return email;
  }

  public void setEmail(String email) {
      this.email = email;
  }

  @Override
  public String toString() {
      return ""
  }
}
