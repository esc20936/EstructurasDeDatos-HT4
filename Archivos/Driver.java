/**
 * @author Mariana David Sosa 201055
 * @author Pablo Escobar 20936
 * 
 * @version v1.0.2
 */

// importaciones modulos
import java.util.Scanner;


public class Driver{

    /**
     * @param message String a imprimir
     * Esta funcion servira para imprimir de manera mas rapida
     */
    public static void print(String message){
        System.out.println(message);
    }
    /**
     * @param message char a imprimir
     * Esta funcion servira para imprimir de manera mas rapida
     */
    public static void print(char message){
        System.out.println(message);
    }
    /**
     * @param stack stack a imprimir
     * Esta funcion servira para imprimir de manera mas rapida
     */
    public static void print(Stack stack){
        while(!stack.isEmpty()){
            System.out.println(""+stack.pop());
        }
    }

    /**
     * @param args Strings que el usuario manda al programa antes de iniciar el programa
     * Esta funcion servira para iniciar el ciclo del programa
     */
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        StackFactory sf = new StackFactory();
        VectorCalculadora vector = new VectorCalculadora();
        String operaciones = vector.decode("datos.txt");
        String[] lineas = operaciones.split("\n");
        Stack myStack = null;
        String tipo="";

        /*****************************      SOLICITUD DE LA IMPLEMENTACION A UTILIZAR ********************************/
        /*************************************************************************************************************/
        boolean bandera=true;
        while(bandera){
            print("Con que implementacion deseas trabajar: (ArrayList,Vector,Lista)");
            tipo=input.nextLine();
            if(tipo.toLowerCase().equals("arraylist") || tipo.toLowerCase().equals("vector") || tipo.toLowerCase().equals("lista")){
                if(tipo.toLowerCase().equals("lista")){
                    print(" Desea trabajar con listas: (simples,dobles)");
                    String tipo2 = input.nextLine();
                    if(tipo2.toLowerCase().equals("simples") || tipo2.toLowerCase().equals("dobles")){
                        tipo = tipo2.toLowerCase();           
                    }else{
                        tipo = null;
                        print("\nINGRESA UNA OPCION VALIDA");
                    }    
                }
            }else{
                tipo = null;
                print("\nINGRESA UNA OPCION VALIDA");
            }
        
            bandera = (tipo==null);
        }
        tipo = tipo.toLowerCase();


        /******************************     CONVERSION Y CALCULO             ******************************************/
        /**************************************************************************************************************/
        int contador = 0;
        int cont =0;
        for(String linea : lineas){

            for(int i = 0; i < linea.length();i++){
                if(linea.charAt(i)!= ' '){
                    contador++;
                }
            }
            Stack operacionInicial = sf.getStackImplementation(tipo,contador);
            Stack numeros = sf.getStackImplementation(tipo,contador);
            Stack operandos = sf.getStackImplementation(tipo,contador);
            Stack operacionFinal = sf.getStackImplementation(tipo,contador);


        
            for(int i = 0; i < linea.length();i++){
                if(linea.charAt(i)!= ' '){
                    operacionInicial.push(linea.charAt(i));
                }
            }

            for(int i = operacionInicial.count();i>0;i--){
                if( Character.isDigit((char) operacionInicial.peek())){
                    numeros.push(operacionInicial.pop());
                }else{
                    operandos.push(operacionInicial.pop());
                }
            }

           int contadorCambiar = 0;
           int contadorI=0;
            while(operacionFinal.count()<contador && contadorI<contador){
                if(contadorCambiar<2){
                    operacionFinal.push(numeros.pop());
                    contadorCambiar++;
                }else{
                    if(!operandos.isEmpty())
                        operacionFinal.push(operandos.pop());
                    if(!numeros.isEmpty())
                        operacionFinal.push(numeros.pop());
                }
                contadorI++;
            }

            print("Lista de operaciones");
            
            Stack stack1 = sf.getStackImplementation(tipo,contador);

            for(int i = operacionFinal.count(); i>0; i--){
                char valor =(char) operacionFinal.pop();
                stack1.push(valor);
            }
            print("El resultado de la linea "+(++cont)+" es: "+ vector.operar(stack1));
            print("**********************************************");
        }
    }
}
