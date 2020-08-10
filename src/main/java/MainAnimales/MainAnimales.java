
package MainAnimales;
import Herbivoros.*;
import Carnivoros.*;
import Ovnivoros.*;



/**
 *
 * @author jesus
 */
public class MainAnimales {
    public static void main (String args []){
        Herbivoros Vaca = new Vaca();
        Vaca.setEdad(1);
        System.out.println(Vaca.toString());
        
        Herbivoros Toro = new Toro();
        Toro.setEdad(13);
        System.out.println(Toro.toString());
        
        Carnivoros Leon = new Leon();
        Leon.setEdad(7);
        System.out.println(Leon.toString());
        
        
        Carnivoros Zorro = new Zorro();
        Zorro.setEdad(7);
        System.out.println(Zorro.toString());
        
        
        Ovnivoros Chipance = new Chipance();
        Chipance.setEdad(12);
        System.out.println(Chipance.toString());
        
        Ovnivoros Avestruz = new Avestruz();
        Avestruz.setEdad(5);
        System.out.println(Avestruz.toString());
        
        
        
    }
    
}
