package questoesjava;
import java.util.Scanner;
public class exercicio10 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	double area,R;
	System.out.print("Digite o raio do c�rculo em metros: ");
	R = sc.nextDouble();
	
	area = Math.PI * Math.pow(R,2);
	
	System.out.format("\nA �rea do c�rculo � %.2f m�.", area);
	System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------");
	
	}
}
