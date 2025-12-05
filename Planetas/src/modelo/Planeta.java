package modelo;

public class Planeta {
  
  private String nombre;
  private double masa;
  private int satelites;
  private double diametro;
  private double volumen;
  private String tipo;
  private double distancia;
  private double rotacion;

  public Planeta() {

  }
  
  public Planeta(String nombre, double masa, int satelites, double diametro, double volumen, String tipo, double distancia, double rotacion) {

    this.nombre = nombre;
    this.masa = masa;
    this.satelites = satelites;
    this.diametro = diametro;
    this.volumen = volumen;
    this.tipo = tipo;
    this.distancia = distancia;
    this.rotacion = rotacion;

  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public double getMasa() {
    return masa;
  }

  public void setMasa(double masa) {
    this.masa = masa; 
  }
  
  public int getSatelites() {
    return satelites; 
  }
  
  public void setSatelites(int satelites) {
    this.satelites = satelites;
  }

  public double getDiametro() {
    return diametro;
  }

  public void setDiametro(double diametro) {
    this.diametro = diametro;
  }

  public double getVolumen() {
    return volumen;
  }

  public void setVolumen(double volumen) {
    this.volumen = volumen;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public double getDistancia() {
    return distancia;
  }

  public void setDistancia(double distancia) {
    this.distancia = distancia;
  }

  public double getRotacion() {
    return rotacion;
  }

  public void setRotacion(double rotacion) {
    this.rotacion = rotacion;
  }

  public double calcularDensidad() {
    return masa / volumen;
  }
  
  public double calcularGravedad() {
    final double G = 6.67430e-11;
    return (G * masa) / Math.pow((diametro/2), 2);
  }

  public String determinarExterior() {
    final double LIMITE = 149597870 * 3.4;
     
    if (distancia > LIMITE)
      return "Es planeta exterior";
    else
      return "No es planeta exterior";
  }

  public double calcularPeriodo() {
    final double G = 6.67430e-11;
    final double MASA_SOL = 1.989e30;

    return 2 * (Math.PI * Math.pow(distancia, 3)) / (G * MASA_SOL);
  }

  public String determinarSimilitud(Planeta planeta2) {
    if (Math.abs(satelites - planeta2.getSatelites()) <= 2 && Math.abs(distancia - planeta2.getDistancia()) <= 150000000 && tipo.equals(planeta2.getTipo()))
      return "Son similares";
    else
      return "No son similares"; 
  }

  @Override
  public String toString() {
    return "***********Planeta " + nombre + "***********\nMasa: " + masa + "\nNúmero de satélites: " + satelites + "\nDiámetro: " + diametro + "\nVolumen: " + volumen + "\nTipo: " + tipo + "\nDistancia media al sol: " + distancia + "\nPeriodo de rotación: " + rotacion;
  }
}
