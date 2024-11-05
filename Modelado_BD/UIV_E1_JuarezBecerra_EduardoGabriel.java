import java.util.Scanner;
import java.util.Stack;

public class UIV_E1_JuarezBecerra_EduardoGabriel{
    public static void main(String[] args) {
        //Necesito que el usuario me pase una cadena 
        Scanner sc = new Scanner(System.in);

        System.out.println("Pasame una cadena");
        String cadena = sc.nextLine();

        //Pasar los caracteres de mi cadena a una pila 
        Stack <Character> pila = new Stack<>();
        char [] arreglo = cadena.toCharArray();

            for (char c : arreglo){
            //Este proceso por default ya voltea los caracteres 
                pila.push(c);
       }
            String respuesta = "";
            for (int i = 0; i<arreglo.length; i++){
                respuesta = respuesta + pila.pop();
        }
        System.out.println("Tu cadena al reves es: ");
        System.out.println(respuesta);
    }
}