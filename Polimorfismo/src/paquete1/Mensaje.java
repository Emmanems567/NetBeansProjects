package paquete1;

public class Mensaje {
  
  private String texto;
  
  //Constructores
  public Mensaje() {
    this.texto = "Hola mundo";
  }

  public Mensaje(String texto) {
    this.texto = texto;
  }

  public Mensaje(String nombre, String texto) {
    this.texto = nombre + " " + texto;
  }

  public Mensaje(String materia, double calificacion) {
    this.texto = materia + ": " + calificacion;
  }

  //Metodos de accceso
  public String getTexto() {
    return texto;
  }

  public void setTexto(String texto) {
    this.texto = texto;
  }

}
