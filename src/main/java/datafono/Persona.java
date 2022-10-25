/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datafono;

/**
 *
 * @author User
 */
public class Persona {
    private String DNI;
    private String nombre;
    private String apellido;
    private String email;

    public Persona(String DNI, String nombre, String apellido, String email) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }
    
    public String nombreCompleto(){
    
        return nombre + " "+ apellido;
}

    @Override
    public String toString() {
        return "Persona{" + "DNI=" + DNI + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + '}';
    }
    
}
