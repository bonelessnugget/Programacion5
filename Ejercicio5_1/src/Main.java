import java.util.Scanner;
public class Main {
//Método que determina si un entero N es primo o no
	static boolean esPrimo(int N) {
		boolean flag = false;
		for (int i = 2; i <= N / 2; ++i) {
		      // condition for nonprime number
		      if (N % i == 0) {
		        flag = true;
		        break;
		      }
		}
		if (flag == false)
			System.out.println(N + " No es primo");
		else
			System.out.println(N + " Es primo");
		return flag;
		
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero");
		int N = teclado.nextInt();
		esPrimo (N);
	}

}
