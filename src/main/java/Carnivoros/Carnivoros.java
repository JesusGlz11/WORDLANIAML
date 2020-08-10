
package Carnivoros;
import Animales.Animales;
/**
 *
 * @author jesus
 */
public class Carnivoros extends Animales {
    private static final String TipoAlimento = "Carnivoros";
   
    public Carnivoros(){
        
    }
     
     public Carnivoros(String genero, String habitad, int edad, String Ncientifico, String nombre, String TipoAlimento){
        super ( genero, habitad, edad, Ncientifico,  nombre, TipoAlimento);
    
}
}

