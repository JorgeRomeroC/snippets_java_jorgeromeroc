import java.util.Scanner;
public class VectoresDinamicos{
	public static void main(String[]args){
		int longitud = 0;
		Scanner entrada = new Scanner(System.in);

		System.out.print("cuantos numeros deseas ingresar?");
		longitud = entrada.nextInt();
		//con esto new int[longitud]; indicamos al prgrama que la longitud
		//que tenga nuestro vector dependera del valor ingresado por el usuario
		int numeros[] = new int[longitud];

		for (int i = 0;i < numeros.length;i++) {
			System.out.println("PORFAVOR dame el valor #" + (i + 1 ));
			numeros[i] = entrada.nextInt();
		}
		for (int i = 0;i < numeros.length;i++) {
			System.out.println("[" + numeros[i] + "]");
		}

	}
}