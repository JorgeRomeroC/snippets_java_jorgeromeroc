import java.util.Scanner;  
public class MatricesDinamicas{
	public static void main(String[]args){
		int filas = 0;
		int columnas = 0;
		int contador = 1;

		Scanner intro = new Scanner(System.in);

		System.out.println("Cuantas filas deseas");
		filas = intro.nextInt();

		System.out.println("Cuantas columnas deseas");
		columnas = intro.nextInt();

		int numeros[][] = new int[filas][columnas];		 

		 for (int j = 0;j < filas;j++ ) {
		 	for (int i = 0;i< columnas;i++) {
		 		numeros[j][i] = contador;
		 		contador++;
		 		System.out.print("[" + numeros[j][i] + "]");
		 	}
		 	System.out.println("");
		 }



	}
}