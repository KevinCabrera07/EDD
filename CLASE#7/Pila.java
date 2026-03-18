import java.util.Stack;

public class Pila {
    public static void main(String[] args) {
       //Creacion objeto pila
        Stack<String>objPila= new Stack<>();

        //ingresar elementos a la pila
        objPila.push("Kevin");
        objPila.push("Maria");
        objPila.push("Juan");
        objPila.push("Carlos");


        //mostrar elementos de la pila
        System.out.println(objPila);

        //Mostrar el elemento en la cima de la pila
        System.out.println("tope de la pila: "+objPila.peek());//Juan

        //Validar si la pila esta llena o vacia
        System.out.println("Pila Vacia: "+objPila.empty());//false

        //Eliminar el elemento en el tope de la pila
        System.out.println("elemento renovido: "+objPila.pop());

        //Posiciones de los elementos con respecto al tope de la pila
        System.out.println("posicion"+objPila.search("Kevin"));
        System.out.println("posicion"+objPila.search("Maria"));
        System.out.println("posicion"+objPila.search("Juan"));
        System.out.println("posicion"+objPila.search("Carlos"));



     
        




    }
}
