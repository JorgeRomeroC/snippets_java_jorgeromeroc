import java.util.Scanner;


public class HoraDia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ingresar= new Scanner(System.in);
		int horas = 0;
		int min = 0;
		String formato = "";
		
		
		System.out.println("Ingrese la Hora: ");
		horas = ingresar.nextInt();
		
		System.out.println("Ingrese los minutos: ");
		min = ingresar.nextInt();
		

		if (horas == 12 && min == 0) {
			System.out.println("Mediodia");
		}else {
			if (horas >= 0 && min == 0) {
				System.out.println("Medianoche");
			}else {
				if (horas > 0 && horas <= 7) {
					System.out.println("Madrugada");
				}else {
					if (horas > 7 && horas <= 12) {
						System.out.println("Mañana");
					}else {
						if (horas > 12 && horas <= 21) {
							System.out.println("Tarde");
						}else {
							if (horas > 21 && horas <= 23) {
								System.out.println("Noche");
							}
						}
					}
				}
			}
		}
		
		

	}

}
