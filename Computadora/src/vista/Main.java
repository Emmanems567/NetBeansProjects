package vista;

import modelo.Computadora;
import modelo.Monitor;

public class Main {
    
    public static void main(String[] args) {
        
        Computadora unaComputadora = new Computadora("Acer", 10000, 3.2, 8);
        Monitor monitor1 = new Monitor("OLED", "8K");
        Monitor monitor2 = new Monitor("LCD", "2K");
        Monitor monitor3 = new Monitor("AMOLED", "4K");
        
        
        unaComputadora.agregarMonitor(monitor1);
        unaComputadora.agregarMonitor(monitor2);
        unaComputadora.agregarMonitor(monitor3);
        
        System.out.println(unaComputadora);
    }
    
}
