package arrays;

import java.util.Scanner;

/**
 *
 * @author jorgeromeroc
 */
public class SumaPromedioArray {

    public static void main(String[] args) {
        /* * Algoritmo con el cual se ingrese por teclado 
            * la cantidad de numeros que queremos sumar, luego 
            * que sume y promedie los valores ingresados por teclado*/
        
        Scanner intro = new Scanner(System.in);

        int longitud = 0;
        int suma = 0;
        double promedio = 0;

        System.out.print("Cuantos numeros desea ingresar: ");
        longitud = intro.nextInt();

        int[] numeros = new int[longitud];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un numero a sumar: ");
            numeros[i] = intro.nextInt();

            suma = suma + numeros[i];
            promedio = (numeros[i] + suma) / longitud;

        }
        System.out.print("La suma de los valor es: " +  suma );
        System.out.print("El promedio de los valores es: " + promedio);
    }
}
