import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		System.out.println("Digite 3 n�meros: ");
		Scanner leitor = new Scanner (System.in);
		int a,b,c;
		a = leitor.nextInt();
		b = leitor.nextInt();
		c = leitor.nextInt();
		
		if ((a>b) && (a>c)) {
			System.out.println("O maior n�mero foi: "+a);
		}
		else if ((b>a) && (b>c)) {
			System.out.println("O maior n�mero foi: "+b);
		}
		else if((c>a) && (c>b)) {
			System.out.println("O maior n�mero foi: "+c);
		}
	}
}
