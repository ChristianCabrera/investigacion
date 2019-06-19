/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tetzu
 */
public class Empleado {
    
    public static void  main(String[]args)
    Empleado daniel = new Empleado("daniel",25);
    Empleado alejandro = new Empleado ("Alejandro",35);
    List<Empleado> empleados = new Arraylist();
    empleados.add(daniel);
    
    class Empleado;        
    String nombre;
    int edad;

    public Empleado(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
