
/**
 * Write a description of class Pc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pc
{
    // instance variables - replace the example below with your own
    private PlacaBase placaBase;
    private int tamaño;
    private String marca;

    /**
     * Constructor for objects of class Pc
     */
    public Pc()
    {
        placaBase = new PlacaBase();
        marca = "acer";
        tamaño = 50;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void sampleMethod(int y)
    {
        // put your code here
        
    }
    public PlacaBase getplacaBase(){
        return placaBase;
    }
    public int getTamaño(){
        return tamaño;
    }
    public String getMarca(){
        return marca; 
    }
    public void setTamaño(int tamaño){
        this.tamaño = tamaño;
    }
    public void setMarca(String marca){
        this.marca = marca; 
    }
    public void setPlacaBase(PlacaBase placaBase){
        this.placaBase = placaBase;
    }
    public void mostrarDetallesPC(){
        System.out.println("El tamaño del pc es de "+getTamaño()+" y es de la siguinte marca "+getMarca());
    }
}
