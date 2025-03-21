
/**
 * Write a description of class PlacaBase here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlacaBase
{
    // instance variables - replace the example below with your own
    private String formato;
    private boolean compatibleDDR;
    private Ram memoria;

    /**
     * Constructor for objects of class PlacaBase
     */
    public PlacaBase()
    {
        // initialise instance variables
        formato = "ATX";
        compatibleDDR = true;
        memoria = new Ram();
    }

    public void setFormato(String formato){
        this.formato = formato;
    }
    
    public void setMemoria(boolean compatible){
        compatibleDDR = compatible;
    }
    
    public String getFormato (){
        return formato; 
    }
    
    public boolean getCompatible(){
        return compatibleDDR;
    }
    
    public Ram getMemoria(){
        return memoria;
    }
    
    public String getAtributos(){
        String resultado = "Atributos de la placa base: formato: " + formato + " compatibilidad con DDR6: " + compatibleDDR +  " " + memoria.getAtributos();
        return resultado;
    }
}
