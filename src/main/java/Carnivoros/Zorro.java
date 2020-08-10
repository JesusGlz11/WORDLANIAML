
package Carnivoros;

/**
 *
 * @author jesus
 */
public class Zorro extends Carnivoros {
     private static final boolean sonido = true;
    private static final String ruido = "ayyyayayay";
    private static final String gebero = "macho";
    private static final String Ncientifico = "Vulpes Vuleps";
    private static final String habitad = "padreras";
    private static final String reino = "Animalia";

    
    public Zorro(){
       
    }
    public Zorro(String genero, String habitad, int edad, String Ncientifico, String nombre){
        super (Zorro.genero, Zorro.habitad, Zorro.edad, Zorro.Ncientifico, Zorro.nombre);
                
    }

    public Zorro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
  
        }
    @Override
    public String ToStringe(){
     return "zorro{" + super.toString() + "ruido=" +ruido+ "}";
     
    }
}
    
}
