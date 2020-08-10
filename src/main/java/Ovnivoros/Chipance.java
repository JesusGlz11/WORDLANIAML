
package Ovnivoros;

/**
 *
 * @author jesus
 */
public class Chipance extends Ovnivoros {
      private static final boolean sonido = true;
    private static final String ruido = "uuuuuuh";
    private static final String gebero = "macho";
    private static final String Ncientifico = "PAan";
    private static final String habitad = "Selvas";
    private static final String reino = "Animalia";

    
    public Chipance(){
       
    }
    public Chipance(String genero, String habitad, int edad, String Ncientifico, String nombre){
        super(Chipance.genero, Chipance.habitad, Chipance.edad, Chipance.Ncientifico, Chipance.nombre);
                
    }

    public Chipance() {
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
     return "Chipance{" + super.toString() + "ruido=" +ruido+ "}";
     
    }
}
    

