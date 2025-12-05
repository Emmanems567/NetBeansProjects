package vista;

import modelo.Kardex;
import modelo.UEA;

public class Main {

  public static void main(String[] args) {

    Kardex kardex1 = new Kardex("23P", "Sandra Garcia", "221204798");
    UEA uea1 = new UEA("POO", "B", "1151044");
    UEA uea2 = new UEA("LPOO", "NA", "1151072");
    UEA uea3 = new UEA("Programacion Estructurada", "MB", "1151038");
    UEA uea4 = new UEA("Complementos de Matematicas", "S", "1112013");
    UEA uea5 = new UEA("Metodos Numericos", "MB", "1151039");

    kardex1.agregarUea(uea1);
    kardex1.agregarUea(uea2);
    kardex1.agregarUea(uea3);
    kardex1.agregarUea(uea4);
    kardex1.agregarUea(uea5);

    System.out.println(kardex1);
    System.out.println("Promedio: " + kardex1.calcularPromedio());
    System.out.println("Aprobadas: " + kardex1.calcularAprobadas());
    System.out.println("Reprobadas: " + kardex1.calcularReprobadas());
    System.out.println("-------------------------");

    Kardex kardex2 = new Kardex("25O", "Emmanuel Adame", "2243040184");
    UEA uea6 = new UEA("Programacion Estructurada", "MB", "1151038");
    UEA uea7 = new UEA("Introduccion al Calculo", "B", "1112042");
    UEA uea8 = new UEA("Complementos de Matematicas", "B", "1112013");
    UEA uea9 = new UEA("Cinematica y Dinamica de Particulas", "S", "1111079");
    UEA uea10 = new UEA("Lab. de Movimiento de una Particula", "B", "1111092");
    UEA uea11 = new UEA("Termodinamica", "B", "1113046");

    kardex2.agregarUea(uea6);
    kardex2.agregarUea(uea7);
    kardex2.agregarUea(uea8);
    kardex2.agregarUea(uea9);
    kardex2.agregarUea(uea10);
    kardex2.agregarUea(uea11);

    System.out.println(kardex2);
    System.out.println("Promedio: " + kardex2.calcularPromedio());
    System.out.println("Aprobadas: " + kardex2.calcularAprobadas());
    System.out.println("Reprobadas: " + kardex2.calcularReprobadas());
  }
}
