package questoesjava;
import java.util.Scanner;
public class exercicio21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x, y, z;
		int b = 0;
		while(b==0) {
			System.out.print("\nDigite a altura em metros que deseja colocar o quadro: ");
			x = sc.nextDouble();
			System.out.print("\nDigite o tamanho, em metros, da escada: ");
			z = sc.nextDouble();
			
			if(z > x) {
				y = Math.sqrt(Math.pow(z, 2)- Math.pow(x, 2));
				System.out.format("\nA escada deve ficar � %.2f m de dist�ncia da parede. ",y);
				System.out.print("\n-----------------------------------------------------------------------------------------------------------------------");
				b=1;
			}
			else {
				System.out.print("\nErro, a escada deve ser maior que a altura que se deseja alcan�ar.");
				System.out.print("\n----------------------------------------------------------------------------------------------------------------------");
			}
		}
	}
}


