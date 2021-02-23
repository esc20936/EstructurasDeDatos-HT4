/**
 * @author Mariana David Sosa 201055
 * @author Pablo Escobar 20936
 * 
 * @version v1.0.2
 */
public class StackFactory{
    /**
     * @param identifier String que nos indica que tipo de implementacion del stack 
     * @param size Int que nos indica de que tamaño sera el stack
     * 
     * @return implementacion de stack que el usuario eligio
     */
    public Stack getStackImplementation(String identifier,int size){
        Stack obj =null;
        switch (identifier){
            case "arraylist":
                obj = new StackArrayList();
                break;
            case "vector":
                obj = new StackVector(size);
                break;
            case "simples":
                obj = new StackList();
                break;
            case "dobles":
                obj = new StackDoubleLinkedList();
                break;
            default:
             obj = null;
            break;
        }
        return obj;
    }
}