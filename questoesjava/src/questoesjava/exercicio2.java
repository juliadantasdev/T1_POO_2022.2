package questoesjava;
import java.util.Scanner;
public class exercicio2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	float nota1,nota2,nota3,media;
	
	System.out.print("Digite a sua nota da n1: ");
	nota1 = sc.nextFloat();
	System.out.print("Digite a sua nota da n2: ");
	nota2 = sc.nextFloat();
	System.out.print("Digite a sua nota da n3: ");
	nota3 = sc.nextFloat();
	
	media = (nota1+nota2+nota3)/3;
	System.out.println("\nSua média é " + media + ".");
	System.out.println("---------------------------------------------------------------------------------------------------------------------");
	}

}
