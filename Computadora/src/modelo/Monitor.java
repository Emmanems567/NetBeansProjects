package modelo;

public class Monitor {
    
    private String tipo;
    private String resolucion;

    public Monitor() {
        
    }

    public Monitor(String tipo, String resolucion) {
        this.tipo = tipo;
        this.resolucion = resolucion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }
    
    @Override
    public String toString() {
        return  "Monitor, Tipo: " + tipo + ", Resolucion: " + resolucion;
    }
    
}
