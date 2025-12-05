package vista;

import modelo.Empleado;
import modelo.PersonalSoporte;
import modelo.Programador;
import modelo.Administrativo;
import modelo.Consultor;

public class Main {
  
  public static void main(String[] args) {
    Empleado empleado1 = new Empleado("Saul Perez", "12345", "A", "REOR874541RFA");
    Administrativo empleado2 = new Administrativo("Ana Zamudio", "1011", "B", "ZAHA780204SC3", "admin1@azc.uam.mx");
    Programador empleado3 = new Programador("Juan Sanchez", "9999", "AA", "SARJ5806249KA");
    Consultor empleado4 = new Consultor("Emmanuel Adame", "23082", "A", "AALE0304295Z1", "Gestor de empleados");
    PersonalSoporte empleado5 = new PersonalSoporte("Jason Gasca", "890145", "B", "COGJ020520TOF", "5582981618");

    System.out.println(empleado1.crearRecibo(20, 100));
    System.out.println("\n----------------------\n");
    System.out.println(empleado2.crearRecibo(25, 775));
    System.out.println("\n----------------------\n");

    empleado3.agregarLenguaje("Java");
    empleado3.agregarLenguaje("C++");
    empleado3.agregarLenguaje("Python");
    System.out.println(empleado3.crearRecibo(30, 800));
    System.out.println("\n----------------------\n");

    System.out.println(empleado4.crearRecibo(20, 600));
    System.out.println("\n----------------------\n");
    System.out.println(empleado5.crearRecibo(30, 500));
    System.out.println("\n----------------------\n");
  }

}
