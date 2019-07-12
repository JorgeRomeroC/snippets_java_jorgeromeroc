import java.util.Scanner;

public class LongitudDeCadena {
    public static void main(String[] args) {
        String cadena_original = "";
        String cadena_substraccion = "";

        int num_caracteres = 0;
        int desde = 0;
        int hasta = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("Introduce una cadena de caracteres: ");
        cadena_original = in.nextLine();

        num_caracteres = cadena_original.length();

        System.out.println("La cadena de caracteres : " + cadena_original  +  " posee "  +  num_caracteres  +  " caracteres ");

        System.out.print("¿Desde que caracter deseas obtener la nueva cadena: ");
        desde = in.nextInt();

        System.out.print("¿Hasta que caracter deseas obtener la nueva cadena: ");
        hasta = in.nextInt();

        cadena_substraccion = cadena_original.substring(desde,hasta);
        System.out.println("la nueva cadena es: " + cadena_substraccion);
    }
}
