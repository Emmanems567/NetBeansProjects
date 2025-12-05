package modelo;

import java.util.ArrayList;

public class Programador extends Empleado {
  private ArrayList<String> lenguajes;

  public Programador() {
    super();
    lenguajes = new ArrayList<>();
  }

  public Programador(String nombre, String numEmpleado, String categoria, String rfc) {
    super(nombre, numEmpleado, categoria, rfc);
    lenguajes = new ArrayList<>();
  }

  public void agregarLenguaje(String lenguaje) {
    lenguajes.add(lenguaje);
  }

  @Override
  public String crearRecibo(int dias, double costo) {
    return "Programador Lenguajes: " + lenguajes + ", " + super.crearRecibo(dias, costo);
  }
}
