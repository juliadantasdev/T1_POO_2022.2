package questoesjava;
import java.util.Scanner;
public class exercicio20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double ang, alt, escada, radiano;
		System.out.print("Digite a medida do �ngulo formado pela escada: ");
		ang = sc.nextDouble();
		System.out.print("\nDigite a altura da parede onde est� aponta da escada:  ");
		alt = sc.nextDouble();
		radiano = (ang * 3.14)/180;
		escada = alt/ Math.sin(radiano);
		System.out.format("A medida da escada �: %.2f metros.", escada);
		System.out.print("\n-----------------------------------------------------------------------------------------------------------------------------");
	}

}
