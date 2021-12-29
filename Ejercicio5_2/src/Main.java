import java.util.Scanner;

public class Main {
	static void divisores(int P, int Q) {
		int contadorDivP = 0;
		int contadorDivQ = 0;
		for (int i = 1; i < P; i++) {
			if (P % i == 0) {
				contadorDivP++;
			}
		}
		for (int j = 1; j < Q; j++) {
			if (Q % j == 0) {
				contadorDivQ++;
			}
		}
		if (contadorDivQ == contadorDivP)
			System.out.println("P y Q tienen el mismo número de divisores");
		else if (contadorDivQ < contadorDivP)
			System.out.println("P tiene más divisores que Q");
		else if (contadorDivQ > contadorDivP)
			System.out.println("Q tiene más divisores que P");
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce P");
		int P = teclado.nextInt();
		System.out.println("Introduce Q");
		int Q = teclado.nextInt();
		divisores(P, Q);
	}
}