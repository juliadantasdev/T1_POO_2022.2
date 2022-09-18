package questoesjava;
import java.util.Scanner;
public class exercicio10 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	double area,R;
	System.out.print("Digite o raio do círculo em metros: ");
	R = sc.nextDouble();
	
	area = Math.PI * Math.pow(R,2);
	
	System.out.format("\nA área do círculo é %.2f m².", area);
	System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------");
	
	}
}
