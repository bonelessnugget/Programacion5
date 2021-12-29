/*
 Dado un número N que se pedirá por teclado y debe ser positivo, imprimir la lista de
todos los numero primos hasta dicho número incluido.
Hacer este programa usando el método primo que ya tenéis construido.
 */
import java.util.Scanner;

public class Main {
	static void primos(int N){
		for (int i = 1; i<N; i++) {
			for (int j = 1; j<N; j++) {
				if (j % i == 0 && j % j == 0) {
					System.out.println(j);
				}
			}
		}
	}
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	System.out.println("Introduce un número: ");
	int N = teclado.nextInt();
	primos(N);
	}

}
