package modelo;

public class UEA {

  private String nombre;
  private String calificacion;
  private String clave;

  public UEA() {}

  public UEA(String nombre, String calificacion, String clave) {

    this.nombre = nombre;
    this.calificacion = calificacion;
    this.clave = clave;
  }

  public String getNombre() {

    return nombre;
  }

  public void setNombre(String nombre) {

    this.nombre = nombre;
  }

  public String getCalificacion() {

    return calificacion;
  }

  public void setCalificacion(String calificacion) {

    this.calificacion = calificacion;
  }

  public String getClave() {

    return clave;
  }

  public void setClave(String clave) {

    this.clave = clave;
  }

  @Override
  public String toString() {

    return "\nNombreUEA: " + nombre + ", Calificacion: " + calificacion + ", Clave: " + clave;
  }
}
