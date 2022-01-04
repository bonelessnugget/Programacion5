/*
 * Escribir un programa que llame a un m�todo con los coeficientes de una ecuaci�n de
segundo grado, a, b y c, y devuelva sus ra�ces en el caso de ser reales.
Nota. Las ra�ces de una ecuaci�n son :
R1=(-b+ra�z(b2-4*a_c))/(2*a)

R2=(-b-ra�z(b2-4*a_c))/(2*a)

Para la ra�z llamar a la clase Math y el m�todo ra�z que es sqrt.
Esta funci�n solo se puede aplicar en el caso de que valor sea positivo es decir:
b2-4*a*c > 0.
 */
import java.util.Scanner;
import java.math.*;
public class Main {
	static void raices(double a, double b, double c) {
		double R1;
		double R2;
		double discriminante;
		discriminante = Math.pow(b, 2)-4*a*c;
		//R1 = (-b + Math.sqrt((Math.pow(b, 2)-4*a*c))/(2*a));
		  R1 = (-b + Math.sqrt(Math.pow(b, 2)-4*a*c)) / 2*a;
		  R2 = (-b - Math.sqrt(Math.pow(b, 2)-4*a*c)) / 2*a;
		//R2 = (-b - Math.sqrt((Math.pow(b, 2)-4*a*c))/(2*a));
		if (discriminante >= 0) {
			System.out.println("Las raices de la ecuaci�n son: " + R1 + " y " + R2);
		}else {
			System.out.println("La raices de la ecuaci�n no son reales.");
		}
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el coeficiente de A: ");
		double a = teclado.nextInt();
		System.out.println("Introduce el coeficiente de B: ");
		double b = teclado.nextInt();
		System.out.println("Introduce el coeficiente de C: ");
		double c = teclado.nextInt();
		raices(a,b,c);
	}

}
