/*
 * Dados m elementos de un conjunto que se desean agrupar de n en n, el número de
combinaciones posibles es m!/(n!*(m-n)!), siendo siempre m >=n (hay que validarlo)
Escribir un método para que, dados como parámetros m y n, nos calcule el número
de combinaciones de m sobre n. Usad el método factorial del ejercicio 3.
 */
import java.util.Scanner;
public class Main {

	static int factorialN(int N) {
	      int factN = 1;
	      for( int i = 1; i <= N; i++ ) {
	         factN *= i;
	      }
	      return factN;
	}
	static int factorialM(int M) {
	      int factM = 1;
	      for( int i = 1; i <= M; i++ ) {
	         factM *= i;
	      }
	      return factM;
	}
	static int factorialmMenosN(int P) {  
		int factP = 1;
	      for( int i = 1; i <= P; i++ ) {
	         factP *= i;
	      }
	      return factP;
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce M: ");
		int M = teclado.nextInt();
		System.out.println("Introduce N: ");
		int N = teclado.nextInt();
		int P = M - N;
		int factM = factorialM(M);
		int factN = factorialN(N);
		int factMN = factorialmMenosN(P);
		if (M >= N) {
			//m!/(n!*(m-n)!)
			int resultado = factM / (factN * (factMN));
			System.out.println("El resultado es: " + resultado);
		}else {
				System.out.println("M tiene que ser mayor que N");
				N = teclado.nextInt();
			}
		}

	}

