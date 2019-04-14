public class TablaMulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserta un numero");
		int num = sc.nextInt();
		
		int res = 0;
		for (int i = 1; i <= 10; i++) {
			res = i * num;

			System.out.println(num + " * " + i + " = " + res);
		}
	}

}