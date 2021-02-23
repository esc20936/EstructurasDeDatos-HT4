/**
 * @author Mariana David Sosa 201055
 * @author Pablo Escobar 20936
 * 
 * @version v1.0.2
 */

// Importamos los modulos que utilizaremos
import java.io.*;
public class VectorCalculadora implements calculadora{
    /**
     * @param x -> sumando 1
     * @param y -> sumando 2
     * Función que utilizaremos para sumar dos numeros
     */
    public int suma(int x, int y){
        return x+y;
    }
    /**
     * @param x -> minuendo 1
     * @param y -> sustraendo 2
     * Función que utilizaremos para restar dos numeros
     */
    public int resta(int x, int y){
        return x-y;
    }
    /**
     * @param x -> Producto 1
     * @param y -> Producto 2
     * Función que utilizaremos para multiplicar dos numeros
     */
    public int multiplicacion(int x, int y){
        return x*y;
    }
    /**
     * @param x -> Dividendo 1
     * @param y -> Divisor 2
     * Función que utilizaremos para divisor dos numeros
     */
    public int division(int x, int y){
        return (int)x/y;
    }

    /**
     * @param x -> Stack donde esta guardado la operación en formato postfix
     * Función que utilizaremos para sumar dos numeros
     */
    public int operar(Stack x){ 

        //Declaracion de variables
        int numero = 0;
        String[] numeros = new String[2];
        numeros[0] = "P";
        numeros[1] = "P";
        while(!x.isEmpty()){
                if(x.count()!=1){

                //Esta parte del codigo sirve para obtener los valores que seran operados
                while(numeros[0]=="P" || numeros[1]=="P"){
                    boolean bandera = true;
                    try{
                        Integer.parseInt(x.peek().toString());
                        bandera = true;

                    }catch(Exception e){
                        bandera = false;
                        System.out.println("EL numero que se intento operar tiene mas de 2 digitos");
                        System.out.println("o el resultado es un negativo");
                        System.out.println("En la guia se indica solo 1 digito por lo que se trabajo con char");
                        System.out.println("Al ser negativo necesita 2 digitos por lo que es valido el error");
                        System.out.println(e.toString());
                        System.out.println(e.getMessage().toString());
                        return 0;
                    }

                    if(x.peek().toString().charAt(0)!='+' && x.peek().toString().charAt(0)!='-' && x.peek().toString().charAt(0)!='*' &&  x.peek().toString().charAt(0)!='/' && bandera){
                        if(numeros[0]=="P")
                            numeros[0]=x.pop().toString();
                        else if(numeros[1]=="P")
                            numeros[1]=  x.pop().toString();
                    }
                }
               // System.out.println(numeros[0]);
               // System.out.println(numeros[1]);

                
                
                // Esta parte del codigo servira para poder operar los numeros e insertar los resultados en el array
                if(!Character.isDigit((char) x.peek())){ 
                int num1=Integer.parseInt(numeros[0]);           
                int num2=Integer.parseInt(numeros[1]);           
                    switch ((char) x.pop()) {
                        case '+':
                            System.out.println("Sumando "+num1+" + "+num2);
                            x.push(suma(num1,num2));
                            System.out.println("Metiendo "+(Object) x.peek()+" al array");
                            break;
                        case '-':
                            System.out.println("Resta "+num1+" - "+num2);
                            x.push(resta(num1,num2));
                            System.out.println("Metiendo "+(Object)x.peek()+" al array");

                            break;
                        case '*':
                            System.out.println("Multiplicando "+num1+" * "+num2);
                            x.push( multiplicacion(num1,num2));
                            System.out.println("Metiendo "+(Object) x.peek()+" al array");

                            break;
                        case '/':
                            System.out.println("Division "+num1+" / "+num2);
                            x.push(division(num1,num2));
                            System.out.println("Metiendo "+(Object) x.peek()+" al array");

                            break;
                    
                        default:
                            break;
                    }
                numeros[0] = "P";
                numeros[1] = "P";
                // Stack temp = x;
                // for(int i=0; i<temp.size();i++){
                //     System.out.print(temp.pop()+" ");

                // }
                // System.out.println("");
                // }
                }
            }else{
                numero =Integer.parseInt(x.pop().toString());   
            }
        }
        return numero;
    }
    /**
     * @param a -> Nombre del archivo del cual obtendremos las operaciones 
     * Función que utilizaremos para poder obtener las operaciones que esten en el archivo
     */
    public String decode(String a){
        String operaciones="";
        File archivo=new File(a);
        String cadena="";
        FileReader fr;
        BufferedReader bf;
        try{
            fr=new FileReader(archivo);
            bf=new BufferedReader(fr);
            while(cadena!=null)
            {
                cadena=bf.readLine();
                if(cadena!=null)
                {
                    operaciones += cadena+"\n";
                }
            }
            bf.close();
            fr.close();
            return operaciones;
        }catch(Exception e){
            return e.toString();
        } 
    }
}