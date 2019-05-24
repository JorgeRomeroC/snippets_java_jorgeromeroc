import java.util.Scanner;
public class CondicionalNumeroMayor{
    public static void main(String[]args){
        Scanner intro = new Scanner(System.in);

        int num1;
        int num2;
        int num3;

        System.out.println("Introduce el primer numero");
        num1 = intro.nextInt();

        System.out.println("Introduce el segundor numero");
        num2 = intro.nextInt();

        System.out.println("Introduce el tercer numero");
        num3 = intro.nextInt();

        if(num1 == num2 && num2 == num3){
            System.out.println("Los numeros son iguales");
        }else if(num1 > num2 &&  num2 > num3){
            System.out.println("El numero mayor es :" + num1 + " , " + num2 + " , " + num3);
        }else if(num1 > num3 &&  num3 > num2){
            System.out.println("El numero mayor es :" + num1 + " , " + num3 + " , " + num2);
        } else if(num2 > num1 && num1 > num3){
            System.out.println("El numero mayor es :" + num2 + " , " + num1 + " , " + num3);
        }else if(num2 > num3 && num3 > num1){
            System.out.println("El numero mayor es :" + num2 + " , " + num3 + " , " + num1);
        }else if(num3 > num1 && num1 > num2){
            System.out.println("El numero mayor es :" + num3 + " , " + num1 + " , " + num2);
        }else if(num3 > num2 &&  num2 > num1){
            System.out.println("El numero mayor es :" + num3 + " , " + num2 + " , " + num1);
        }
    }
}