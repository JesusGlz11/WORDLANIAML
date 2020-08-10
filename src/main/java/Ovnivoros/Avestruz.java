
package Ovnivoros;

/**
 *
 * @author jesus
 */
public class Avestruz extends Ovnivoros {
    private static final boolean sonido = true;
    private static final String ruido = "BBURURU";
    private static final String gebero = "hembra";
    private static final String Ncientifico = "Strthio Camelus";
    private static final String habitad = "Desierto";
    private static final String reino = "Animalia";

    
    public Avestruz(){
       
    }
    public Avestruz(String genero, String habitad, int edad, String Ncientifico, String nombre){
        super(Avestruz.genero, Avestruz.habitad, Avestruz.edad, Avestruz.Ncientifico, Avestruz.nombre);
                
    }
    
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
  
        }
    @Override
    public String ToStringe(){
     return "Avestruz{" + super.toString() + "ruido=" +ruido+ "}";
     
    }
}
    
}
