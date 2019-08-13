import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		System.out.println("Digite 3 números: ");
		Scanner leitor = new Scanner (System.in);
		int a,b,c;
		a = leitor.nextInt();
		b = leitor.nextInt();
		c = leitor.nextInt();
		
		if ((a>b) && (a>c)) {
			System.out.println("O maior número foi: "+a);
		}
		else if ((b>a) && (b>c)) {
			System.out.println("O maior número foi: "+b);
		}
		else if((c>a) && (c>b)) {
			System.out.println("O maior número foi: "+c);
		}
	}
}
