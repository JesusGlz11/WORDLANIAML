

package Ovnivoros;
import Animales.Animales;

/**
 *
 * @author jesus
 */
public class Ovnivoros extends Animales {
    private static final String TipoAlimento= "Ovnivoros";
    
           public Ovnivoros(){
               
           }
           public Ovnivoros (String genero, String habitad, int edad, String Ncientifico, String nombre, String TipoAlimento){
               super ( genero, habitad, edad, Ncientifico,  nombre, TipoAlimento);
               
           }
}
