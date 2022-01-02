/*
 * Escribir un m�todo al que se le d� como par�metro un valor r, que representa el radio
de una figura, una opci�n: un dato entero que ser� 1, 2 � 3. El m�todo debe devolver:
 En el caso opci�n 1, la longitud del circulo de radio r dada por la expresi�n 2*PI*r
 En el caso opci�n 2, la superficie del circulo dada por la expresi�n PI*r2
 En el caso opci�n 3, el volumen de una esfera de radio r dada por la expresi�n
4/3*PI*r3
NOTA: PI es la constante 3,14159
 */
import java.util.Scanner;
public class Main {

	static void calculoRadio(int R, int O){
		double PI = 3.14159;
		double resultado;
		if (O == 1) {
			resultado = 2 * PI * R;
			System.out.println("La longitud del circulo es: " + resultado);
		}
		
		if (O == 2) {
			resultado = PI * (Math.pow(R, 2));
			System.out.println("La superficie del circulo es: " + resultado);
		}
		
		if (O == 3) {
			resultado = (4/3) * PI * (Math.pow(R,3));
			System.out.println("El volumen es: " + resultado);
		}
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el radio:");
		int R = teclado.nextInt();
		System.out.println("Elige una opci�n donde 1 calcula la longitud," + "\n" + 
		"2 la superficie y 3 el volumen.");
		int O = teclado.nextInt();
		calculoRadio(R,O);

	}

}
