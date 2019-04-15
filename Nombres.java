import java.util.Scanner;
public class Nombres{
	public static void main(String[]args){
		String nombre_uno = "";
		String nombre_dos = "";

		Scanner entrada = new Scanner(System.in);

		System.out.println("Porfavor ingresa el primer nombre: ");
		nombre_uno = entrada.nextLine();

		System.out.print("Porfavor dame el segundo nombre: ");
		nombre_dos = entrada.nextLine();

		if(nombre_uno.equalsIgnoreCase(nombre_dos)){
			System.out.println("los nombres son iguales");
		}else{
			System.out.println("Los nombres son diferentes");
		}

	}
}
