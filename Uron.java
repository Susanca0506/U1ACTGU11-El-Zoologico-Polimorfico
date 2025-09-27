/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utng.edu.mx.milanesas;

/**
 *
 * @author carde
 */
public class Uron extends Animal implements Mascota{

    public Uron(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.print("Dook dook! ");
    }

    @Override
    public void moverse() {
        System.out.print(" Estoy saltando de alegria.");
    }
    
    //implements mascota
    // public interface Mascota

    @Override
    public void jugar() {
        System.out.println(getNombre()+" juega a saltar y correr.");
    }
}
