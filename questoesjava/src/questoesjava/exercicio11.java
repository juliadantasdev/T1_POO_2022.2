package questoesjava;
import java.util.Scanner;
public class exercicio11 {

	public static void main(String[] args) {
	Scanner sc =  new Scanner(System.in);
	double num, quad, cubo, r2, r3;
	int x =0;
	while(x==0) {
	System.out.print("Digite um n�mero inteiro e positivo: ");
	num = sc.nextDouble();
	
	if(num > 0) {
	quad = Math.pow(num, 2);
	cubo = Math.pow(num, 3);
	r2 = Math.sqrt(num);
	r3 = Math.cbrt(num);
	x = 1;
	System.out.format("\nO n�mero %.0f ao quadrado � %.0f. \nAo cubo � %.0f.\nSua raiz quadrada � %.1f.\nE sua raiz c�bica � %.1f.", num, quad, cubo, r2, r3);
	System.out.println("\n-------------------------------------------------------------------------------------------------------------------------------------------------");
	}
	else {
	System.out.println("Erro, troque de n�mero");
	System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
	}
	}
	}
	}

