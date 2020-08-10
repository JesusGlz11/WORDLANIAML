
package Herbivoros;
import Animales.Animales;

/**
 *
 * @author jesus
 */
public class Herbivoros extends Animales {
    private static final String TipoAlimento= "Herbivoro";
    
           public Herbivoros(){
               
           }
           public Herbivoros (String genero, String habitad, int edad, String Ncientifico, String nombre, String TipoAlimento){
               super ( genero, habitad, edad, Ncientifico,  nombre, TipoAlimento);
               
           }
    
    
}
