import java.util.Scanner;
public class ImprimirCaracteres {
    /*Jorge Romero C*/
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        String palabra = "";
        System.out.println("Ingrese cadena");
        palabra = intro.nextLine();
        int caract = 0;
        for (int i = 0; i < palabra.length(); i++) {
            System.out.println("El caracter " + i + " es " + palabra.substring(caract, i+1));
            caract++;

        }
    }

}
