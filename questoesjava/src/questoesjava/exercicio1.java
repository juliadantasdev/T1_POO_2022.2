package questoesjava;
import java.util.Scanner;
public class exercicio1 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	
	int n1,n2,n3,n4,soma;
	
	System.out.print("Digite o 1º número inteiro: ");
	n1 = sc.nextInt();
	System.out.print("Digite o 2º número inteiro: ");
	n2 = sc.nextInt();
	System.out.print("Digite o 3º número inteiro: ");
	n3 = sc.nextInt();
	System.out.print("Digite o 4º número inteiro: ");
	n4 = sc.nextInt();
	
	soma = (n1+n2+n3+n4);
	System.out.println("A soma desses números é " + soma);
	System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
	

	}

}
