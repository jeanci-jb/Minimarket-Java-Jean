package Modelo;

public class Estado {
    private int id;
    private String nombre;

    public Estado() {}

    public Estado(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // sobrescribir la presentacion, en lugar del objeto estado
    @Override
    public String toString() {
        return nombre;
    }
    
}