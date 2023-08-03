package Consolas;

/**
 *
 * @author csaul
 */
public abstract class ConsolaDeVideojuegos {

    private String nombre;
    private String paisOrigen;
    private int year;
    private String noSerie;

    public ConsolaDeVideojuegos(String nombre, String paisOrigen, int year,String noSerie) {
        this.nombre = nombre;
        this.paisOrigen = paisOrigen;
        this.year = year;
        this.noSerie = noSerie;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "ConsolaDeVideojuegos{" + "nombre=" + nombre + ", paisOrigen=" + paisOrigen + ", year=" + year + '}';
    }
    
    
}
