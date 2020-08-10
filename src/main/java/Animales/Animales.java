
package Animales;

/**
 *
 * @author jesus
 */
public class Animales {
    protected String genero;
     protected String habitad;
      protected int edad;
       protected String Ncientifico;
        protected String nombre;
         protected String TipoAlimento;
         
         public Animales () {
         }
             public Animales (String genero, String habitad, int edad, String Ncientifico, String nombre, String TipoAlimento){
                 this.genero = genero;
                 this.habitad = habitad;
                 this.edad = edad;
                 this.Ncientifico = Ncientifico;
                 this.nombre = nombre;
                 this.TipoAlimento = TipoAlimento;
             }
                 @Override
                 public String ToStringe(){
                     return "Animales{" + "genero=" +genero+  "habitad=" + habitad + "edad" + edad + "nombreCientifico" + Ncientifico + "nombre"+nombre+ "TipoAlimento"+TipoAlimento+ "}";
                     
                           
                     
                     
         }
    
}
