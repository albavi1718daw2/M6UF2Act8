package taller;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author bazag
 */
@Entity
public class Persona implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @Id @GeneratedValue
    private long id;
    
    private String nombre, apellidos, dni;
    private int edad;
    private boolean expres;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public boolean isExpres() {
        return expres;
    }

    public void setExpres(boolean expres) {
        this.expres = expres;
    }
    
    @Override
    public String toString() {
        return "Persona [id=" + id + ", nombre=" + nombre + ", apellidos="
                + apellidos + ", expres=" + expres + ", edad=" + edad + "]";
    }
}
