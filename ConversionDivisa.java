import java.util.Scanner;
/*Jorge Romero C*/
public class ConversionDivisa {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        double cantidadEuro;
        double dolar;
        double peso;
        double libra;
        int opcion;

        System.out.println("Ingrese cantidad");
        cantidadEuro = intro.nextDouble();

        System.out.println("Escoja la una opcion de conversiòn");
        System.out.println("1- Dolar");
        System.out.println("2- Peso");
        System.out.println("3- Libra");
        opcion = intro.nextInt();

        if (opcion == 1){
            System.out.println("La cantidad ingresada, a dolares es: " + (cantidadEuro * 1.13));
        }else if(opcion == 2){
            System.out.println("La cantidad ingresada, a peso chileno es: " + (cantidadEuro * 766.38));
        }else if(opcion == 3){
            System.out.println("La cantidad ingresada, a peso Libra esterlina es: " + (cantidadEuro * 0.90));
        }else{
            System.out.println("");
        }


    }
}
