package models;

public class Cliente {
    private String nombre;
    private String nif; // Número de Identificación Fiscal

    // Constructor
    public Cliente() {
        this.nombre = nombre;
        this.nif = nif;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getNif() {
        return nif;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }
}