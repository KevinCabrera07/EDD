

import java.util.Stack;

public class PILA93 {
   public static boolean estaBalanceado(String expresion) {
        Stack<Character> pila = new Stack<>();

        for (int i = 0; i < expresion.length(); i++) {
            char c = expresion.charAt(i);

            
            if (c == '(' || c == '{' || c == '[') {
                pila.push(c);
            }

            
            if (c == ')' || c == '}' || c == ']') {
                if (pila.isEmpty()) {
                    return false;
                }

                char tope = pila.pop();

                if ((c == ')' && tope != '(') ||
                    (c == '}' && tope != '{') ||
                    (c == ']' && tope != '[')) {
                    return false;
                }
            }
        }

        return pila.isEmpty();
    }

    public static void main(String[] args) {
        String expr1 = "((a+b)*5) - 7";
        String expr2 = "2*(a+b)/2.5 + x - 7*y]";

        System.out.println("Expresión 1 balanceada: " + estaBalanceado(expr1));
        System.out.println("Expresión 2 balanceada: " + estaBalanceado(expr2));
    }
}
