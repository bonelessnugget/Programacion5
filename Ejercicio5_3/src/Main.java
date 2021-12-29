import java.util.Scanner;
public class Main {
	static int factorial(int N) {
	      int fact = 1;
	      for( int i = 1; i <= N; i++ ) {
	         fact *= i;
	      }
	      System.out.println("El factorial de " + N + " es " + fact);
	      return fact;
	}
	public static void main(String[] args) {
		System.out.println("Introduce un numero para saber su factorial.");
		Scanner teclado = new Scanner(System.in);
		int N = teclado.nextInt();
		if (N > 0) {
			factorial(N);
		}

	}

}
