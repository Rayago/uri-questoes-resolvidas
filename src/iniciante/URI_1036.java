package iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/*
Leia 3 valores de ponto flutuante e efetue o cálculo das raízes 
da equação de Bhaskara. Se não for possível calcular as raízes, 
mostre a mensagem correspondente “Impossivel calcular”, caso haja 
uma divisão por 0 ou raiz de numero negativo.

Entrada
Leia três valores de ponto flutuante (double) A, B e C.

Saída
Se não houver possibilidade de calcular as raízes, apresente a mensagem 
"Impossivel calcular". Caso contrário, imprima o resultado das raízes 
com 5 dígitos após o ponto, com uma mensagem correspondente conforme 
exemplo abaixo. Imprima sempre o final de linha após cada mensagem.
 */

public class URI_1036 {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		sc.close();
		
		double delta = Math.pow(b, 2) - 4 * a * c;
		if(delta < 0 || a == 0) {
			System.out.printf("Impossivel calcular\n");
			
		} else {
			double r1 = (-b + Math.sqrt(delta))/(2 * a);
			double r2 = (-b - Math.sqrt(delta))/(2 * a);
			
			System.out.printf("R1 = %.5f\n", r1);
			System.out.printf("R2 = %.5f\n", r2);
			
		}
		
	}

}
