/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utng.edu.mx.milanesas;

/**
 *
 * @author carde
 */
public class Burro extends Animal {

    public Burro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.print("Ihoooo ihoooo! ");
    }

    @Override
    public void moverse() {
        System.out.print("Estoy ambleando.");
    }
    
}
