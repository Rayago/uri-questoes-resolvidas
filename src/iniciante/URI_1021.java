package iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/*
Leia um valor de ponto flutuante com duas casas decimais. Este valor 
representa um valor monetário. A seguir, calcule o menor número de notas 
e moedas possíveis no qual o valor pode ser decomposto. As notas 
consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 
1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas necessárias.

ENTRADA
O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

SAÍDA
Imprima a quantidade mínima de notas e moedas necessárias para trocar o 
valor inicial, conforme exemplo fornecido.

Obs: Utilize ponto (.) para separar a parte decimal.
 */

public class URI_1021 {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		float valor = sc.nextFloat();
		sc.close();
		
		int notas100, notas50, notas20, notas10, notas5, notas2;
		int moedas1, moedas50, moedas25, moedas10, moedas05; 
		
		/*
		 * Não precisamos de uma variável "moedas01" porque ela será equivalente
		 * à variável "valor" no final.
		 */
		
		notas100 = (int) (valor / 100);
		valor -= notas100 * 100;
		
		notas50 = (int) (valor / 50);
		valor -= notas50 * 50;
		
		notas20 = (int) (valor / 20);
		valor -= notas20 * 20;
		
		notas10 = (int) (valor / 10);
		valor -= notas10 * 10;
		
		notas5 = (int) (valor / 5);
		valor -= notas5 * 5;
		
		notas2 = (int) (valor / 2);
		valor -= notas2 * 2;
		
		valor *= 100;
		
		//Multipliquei por 100 para poder repetir o molde anterior dos cálculos.
		
		//Notas
		
		moedas1 = (int) (valor / 100);
		valor -= moedas1 * 100;
		
		moedas50 = (int) (valor / 50);
		valor -= moedas50 * 50;
		
		moedas25 = (int) (valor / 25);
		valor -= moedas25 * 25;
		
		moedas10 = (int) (valor / 10);
		valor -= moedas10 * 10;
		
		moedas05 = (int) (valor / 5);
		valor -= moedas05 * 5;
		
		valor = Math.round(valor);
		
		/*
		 * Há, pelo menos, duas formas melhores de fazer essa questão,
		 * mas acredito que esta seja a mais didática para repassar
		 * a lógica dela.
		 */
		
		System.out.printf("NOTAS:\n");
		System.out.printf("%d nota(s) de R$ 100.00\n", notas100);
		System.out.printf("%d nota(s) de R$ 50.00\n", notas50);
		System.out.printf("%d nota(s) de R$ 20.00\n", notas20);
		System.out.printf("%d nota(s) de R$ 10.00\n", notas10);
		System.out.printf("%d nota(s) de R$ 5.00\n", notas5);
		System.out.printf("%d nota(s) de R$ 2.00\n", notas2);
		
		System.out.printf("MOEDAS:\n");
		System.out.printf("%d moeda(s) de R$ 1.00\n", moedas1);
		System.out.printf("%d moeda(s) de R$ 0.50\n", moedas50);
		System.out.printf("%d moeda(s) de R$ 0.25\n", moedas25);
		System.out.printf("%d moeda(s) de R$ 0.10\n", moedas10);
		System.out.printf("%d moeda(s) de R$ 0.05\n", moedas05);
		System.out.printf("%.0f moeda(s) de R$ 0.01\n", valor);
	}

}
