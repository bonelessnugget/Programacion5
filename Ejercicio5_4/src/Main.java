/*
 Dado un n�mero N que se pedir� por teclado y debe ser positivo, imprimir la lista de
todos los numero primos hasta dicho n�mero incluido.
Hacer este programa usando el m�todo primo que ya ten�is construido.
 */
import java.util.Scanner;

public class Main {
static void sonPrimos(int N) {
	int contador = 0;
	for(int i = 2; i < (N/2+1); i++) {
		if (N % i == 0) {
			contador++;
			break;
		}
	}
	if (contador == 0) {
		System.out.println(N + " ");
	}
}
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	System.out.println("Introduce un n�mero: ");
	int N = teclado.nextInt();
	System.out.println("Los numeros primos antes que " + N + " ,incluido, son: ");
	for (int i = 2; i <= N +1; i++) {
		sonPrimos(i);
	}
	}

}
