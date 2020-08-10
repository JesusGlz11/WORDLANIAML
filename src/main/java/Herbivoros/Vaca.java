
package Herbivoros;

/**
 *
 * @author jesus
 */
public class Vaca extends Herbivoros {
    
    private static final boolean sonido = true;
    private static final String ruido = "MUUUUUUU";
    private static final String gebero = "Hembra";
    private static final String Ncientifico = "Bos primigenius taurus";
    private static final String habitad = "Campo";
    private static final String reino = "Animalia";

    
    public Vaca(){
       
    }
    public Vaca(String genero, String habitad, int edad, String Ncientifico, String reino){
        super(Vaca.genero, Vaca.habitad, Vaca.edad, Vaca.Ncientifico, Vaca.reino);
        
                
    }
    
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
  
        }
    @Override
    public String ToStringe(){
     return "Vaca{" + super.toString() + "ruido=" +ruido+ "}";
     

}
}

