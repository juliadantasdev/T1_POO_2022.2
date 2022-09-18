package questoesjava;
import java.util.Scanner;
public class exercicio23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número real: ");
		double num = sc.nextDouble();
		int i = (int)num;
		System.out.println("A parte inteira desse número é " + i);
		float f = (float)(num-i);
		System.out.println("A parte fracionária desse número é: " +  f);
		System.out.format("O número arredondado é: %.2f " ,num);
		System.out.print("\n---------------------------------------------------------------------------");
	}

}
