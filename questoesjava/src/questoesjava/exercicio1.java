package questoesjava;
import java.util.Scanner;
public class exercicio1 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	
	int n1,n2,n3,n4,soma;
	
	System.out.print("Digite o 1� n�mero inteiro: ");
	n1 = sc.nextInt();
	System.out.print("Digite o 2� n�mero inteiro: ");
	n2 = sc.nextInt();
	System.out.print("Digite o 3� n�mero inteiro: ");
	n3 = sc.nextInt();
	System.out.print("Digite o 4� n�mero inteiro: ");
	n4 = sc.nextInt();
	
	soma = (n1+n2+n3+n4);
	System.out.println("A soma desses n�meros � " + soma);
	System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
	

	}

}
