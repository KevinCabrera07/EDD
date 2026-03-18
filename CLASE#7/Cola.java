import java.util.LinkedList;
import java.util.Queue;

public class Cola {
    public static void main(String[] args) {

    Queue<Integer> objCola = new LinkedList();

    //agregar elementos a la cola(add,offer)
    objCola.add(07);
    objCola.add(20);
    objCola.offer(4);
    objCola.offer(05);

    //mostrar elementos de la cola
    System.out.println(objCola);

    //mostrar la cabeza de la cola (element,peek)
    System.out.println("cabeza de la cola(element): "+objCola.element());
    System.out.println("cabeza de la cola(peek): "+objCola.peek());

    //eliminar de la cabeza de la cola(poll,remove)
    System.out.println("elemento eliminado(poll): "+objCola.poll());//07
    System.out.println("elemento eliminado(remove): "+objCola.remove());//20

    //mostrar los elementos de la cola
    System.out.println(objCola);

    //Mostrar el tamaño de la cola
    System.out.println("tamaño de la cola(size): "+objCola.size());









}
}