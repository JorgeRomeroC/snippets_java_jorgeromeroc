public class Comversiones {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		int a;
		int b;
		double x, y;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Escribe un numero entero");
		//la variable a es de tipo entero, asi es que debemos converitrla a string con: Integer.parseInt();
		a = Integer.parseInt(br.readLine());
		
		System.out.print("Escribe un numero entero");
		//la variable a es de tipo entero, asi es que debemos converitrla a string con: Integer.parseInt();
		b = Integer.parseInt(br.readLine());
		
		System.out.print("Escribe un numero real");
		//la variable a es de tipo entero, asi es que debemos converitrla a string con: Integer.parseInt();
		x = Double.parseDouble(br.readLine());
		
		System.out.print("Escribe un numero real");
		//la variable a es de tipo entero, asi es que debemos converitrla a string con: Integer.parseInt();
		y = Double.parseDouble(br.readLine());
		
		System.out.println("ENTEROS");
		
		System.out.println("a+b = " + (a+b));
		
		System.out.println("a-b = " + (a-b));
		
		System.out.println("b-a = " + (b-a));
		
		System.out.println("a*b = " + (a*b));
		
		System.out.println("a/b = " + (a/b));
		
		System.out.println("b/a = " + (b/a));

		System.out.println("a%b = " + (a%b));
		
		System.out.println("b%a = " + (b%a));
		
		
		System.out.println("REALES");
		
		System.out.println("x+y = " + (x+y));
		
		System.out.println("x-y = " + (x-y));
		
		System.out.println("y-x = " + (y-x));
		
		System.out.println("x*y = " + (x*y));
		
		System.out.println("x/y = " + (x/y));
		
		System.out.println("y/x = " + (y/x));

		System.out.println("x%y = " + (x%y));
		
		System.out.println("y%x = " + (y%x));
		
		
	}

}
