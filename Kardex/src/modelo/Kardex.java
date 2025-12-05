package modelo;

import java.util.ArrayList;

public class Kardex {

  private String trimestre;
  private Alumno alumno;
  private ArrayList<UEA> ueas;

  public Kardex() {

    alumno = new Alumno();
    ueas = new ArrayList<>();
  }

  public Kardex(String trimestre, String nombre, String matricula) {

    this.trimestre = trimestre;
    alumno = new Alumno(nombre, matricula);
    ueas = new ArrayList<>();
  }

  public String getTrimestre() {

    return trimestre;
  }

  public void setTrimestre(String trimestre) {

    this.trimestre = trimestre;
  }

  public double calcularPromedio() {

    double suma = 0;
    int materias = 0;

    for (UEA i : ueas) {

      int calificacion = 0;

      if (i.getCalificacion().equals("MB")) calificacion = 10;
      else if (i.getCalificacion().equals("B")) calificacion = 8;
      else if (i.getCalificacion().equals("S")) calificacion = 6;
      else if (i.getCalificacion().equals("NA")) calificacion = 0;

      if (calificacion == 10 || calificacion == 8 || calificacion == 6) {

        suma += calificacion;
        materias++;
      }
    }

    return suma / materias;
  }

  public int calcularAprobadas() {

    int materias = 0;

    for (UEA i : ueas) {

      if (i.getCalificacion().equals("MB")
          || i.getCalificacion().equals("B")
          || i.getCalificacion().equals("S")) materias++;
    }

    return materias;
  }

  public int calcularReprobadas() {

    int materias = 0;

    for (UEA i : ueas) {

      if (i.getCalificacion().equals("NA")) materias++;
    }

    return materias;
  }

  public void agregarUea(UEA uea) {

    ueas.add(uea);
  }

  @Override
  public String toString() {

    return "Kardex\nTrimestre: " + trimestre + "\nAlumno\n" + alumno.toString() + "\nUEAS\n" + ueas;
  }
}
