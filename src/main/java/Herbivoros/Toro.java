//
package Herbivoros;

/**
 *
 * @author jesus
 */
public class Toro extends Herbivoros {
     private static final boolean sonido = true;
    private static final String ruido = "buuf";
    private static final String gebero = "macho";
    private static final String Ncientifico = "Bos primigenius taurus";
    private static final String habitad = "Campo";
    private static final String reino = "Animalia";

    
    public Toro(){
       
    }
    
    public Toro(String genero, String habitad, int edad, String Ncientifico, String reino){
        super(Toro.genero, Toro.habitad, Toro.edad, Toro.Ncientifico, Toro.reino);
        
                
    }

    public Toro() {
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
     return "Toro{" + super.toString() + "ruido=" +ruido+ "}";
     

}

    
}
