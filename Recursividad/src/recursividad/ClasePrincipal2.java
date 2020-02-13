package recursividad;

import java.util.Scanner;

public class ClasePrincipal2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el numero para calcular su factorial: ");
		int numero = entrada.nextInt();
		Recursividad2 recursividad2 = new Recursividad2();

		int factorial = recursividad2.Factorial(numero);
		System.out.println("El factorial de " + numero + " es " + factorial);

	}

}
