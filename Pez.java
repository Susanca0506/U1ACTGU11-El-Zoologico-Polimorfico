/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utng.edu.mx.milanesas;

/**
 *
 * @author carde
 */
public class Pez extends Animal implements Mascota{

    public Pez(String nombre, int edad) {
        super(nombre, edad);
    }
    
    @Override
    public void hacerSonido() {
        System.out.print("Glu glu! ");
    }

    @Override
    public void moverse() {
        System.out.print("Estoy nadando lentamente.");
    }

    @Override
    public void jugar() {
        System.out.println(getNombre()+" juega y nada alrededor del dedo.");
    }
    
}
