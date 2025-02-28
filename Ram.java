
/**
 * Write a description of class Memoria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ram
{
    // instance variables - replace the example below with your own
    private int memoria;
    private String formato;

    /**
     * Constructor for objects of class Memoria
     */
    public Ram()
    {
        memoria = 8000;
        formato = "ddr5";
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void setMemoria(int memoria){
        this.memoria = memoria;
    }
    
    public void setFormato(String formato){
        this.formato = formato;
    }
    //getter memoria
    public int getMemoria(){
        return memoria;
    }
    
    //getter formato
    public String getFormato (){
        return formato;
    }
}


