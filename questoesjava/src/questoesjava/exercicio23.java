package questoesjava;
import java.util.Scanner;
public class exercicio23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um n�mero real: ");
		double num = sc.nextDouble();
		int i = (int)num;
		System.out.println("A parte inteira desse n�mero � " + i);
		float f = (float)(num-i);
		System.out.println("A parte fracion�ria desse n�mero �: " +  f);
		System.out.format("O n�mero arredondado �: %.2f " ,num);
		System.out.print("\n---------------------------------------------------------------------------");
	}

}
