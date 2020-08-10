
package Carnivoros;
import Animales.Animales;

/**
 *
 * @author jesus
 */
public class Leon extends Carnivoros {
    private static final boolean sonido = true;
    private static final String ruido = "grrrrr";
    private static final String gebero = "macho";
    private static final String Ncientifico = "Panthera leo";
    private static final String habitad = "sabana";
    private static final String reino = "Animalia";

    
    public Leon(){
       
    }
    public Leon(String genero, String habitad, int edad, String Ncientifico, String nombre){
        super (Leon.genero, Leon.habitad, Leon.edad, Leon.Ncientifico, Leon.nombre);
                
    }
    
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
  
        }
    @Override
    public String ToStringe(){
     return "Leon{" + super.toString() + "ruido=" +ruido+ "}";
     
    }
}


    
    

