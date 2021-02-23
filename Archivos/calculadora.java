/**
 * @author Ana de León
 * @author María Elisa
 * @author Diego Perdomo
 * @version 1.0.0
 */
public interface calculadora 
{
    //Metodo para sumar 2 elementos 
    public int suma(int x, int y);
    //Método para poder restar 2 elementos
    public int resta(int x, int y);
    //Método para multiplicar 2 elementos 
    public int multiplicacion(int x, int y);
    //Método para dividir 2 elementos 
    public int division(int x, int y);
    public int operar(Stack x);//operar recibe un stack en formato postfix, y lo opera para devolver un entero que es igual al valor total de la operación
    public String decode(String a);//función que se encarga de leer el archivo y decodificar cada línea para realizar las operaciones de cada una
}