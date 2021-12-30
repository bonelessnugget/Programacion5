/*
 * Escribir un m�todo que con dos par�metros enteros p y q nos devuelva el m.c.d.
(m�ximo com�n divisor) de ambos.
 */
import java.util.Scanner;
public class Main {
	public static int mcd(int P, int Q) {
	    int temporal;//Para no perder b
	    while (Q != 0) {
	        temporal = Q;
	        Q = P % Q;
	        P = temporal;
	    }
	    return P;
	    
	}
	public static int mcm(int P, int Q) {
		int mcdfinal = (P*Q) / mcd(P,Q);
		System.out.print("El MCM es: " + mcdfinal);
	    return (P * Q) / mcd(P, Q);
	}
	
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	System.out.println("Introduce P");
	int P = teclado.nextInt();
	System.out.println("Introduce Q");
	int Q = teclado.nextInt();
	mcd(P,Q);
	mcm(P,Q);
	}

}
