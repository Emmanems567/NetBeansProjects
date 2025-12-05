package paquete1;

public class MainPolimorfismo {

  public static void main(String[] args) {

    Operacion op1 = new Operacion();
    Mensaje mensaje1 = new Mensaje();
    Mensaje mensaje2 = new Mensaje("Hola");
    Mensaje mensaje3 = new Mensaje("POO", 8.9);
    Mensaje mensaje4 = new Mensaje("Hola", "Bogueto");

    System.out.println(op1.sumar(2,5));
    System.out.println(mensaje1.getTexto());
    System.out.println(mensaje2.getTexto());
    System.out.println(mensaje3.getTexto());
    System.out.println(mensaje4.getTexto());
  }
}
