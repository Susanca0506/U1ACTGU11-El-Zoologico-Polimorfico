/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utng.edu.mx.milanesas;

/**
 *
 * @author carde
 */
public class MainZoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal[] zoo = new Animal[3];
        
        zoo[0] = new Pez("Richard",2);
        zoo[1] = new Burro("Tito",5);
        zoo[2] = new Uron("Fito",2);
        
        for (Animal zoo1 : zoo) {
            System.out.println("Soy un " + zoo1.getClass().getSimpleName() + " llamado " + zoo1.getNombre() + ", tengo " + zoo1.getEdad() + " años");
            zoo1.hacerSonido();
            zoo1.moverse();
            
            System.out.println("");
            if(zoo1 instanceof Mascota mascota){
                mascota.jugar();
            }
           
            System.out.println();
        }
        
        
    }
    
}
