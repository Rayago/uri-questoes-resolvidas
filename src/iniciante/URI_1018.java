package iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/*
Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis 
(cédulas) no qual o valor pode ser decomposto. As notas consideradas são de 
100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas 
necessárias.

Entrada
O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

Saída
Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo 
necessárias, conforme o exemplo fornecido. Não esqueça de imprimir o fim de 
linha após cada linha, caso contrário seu programa apresentará a mensagem: 
“Presentation Error”.
 */

public class URI_1018 {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		int valor = sc.nextInt();
		sc.close();
		
		int notas100, notas50, notas20, notas10, notas5, notas2;
		
		/*
		 * Não precisamos de uma variável "notas1" porque ela será equivalente
		 * à variável "valor" no final.
		 */
		
		System.out.printf("%d\n", valor);
		
		/*
		 * Printei a variável valor antes das outras, pois pretendo reutilizar ela 
		 * pra alocar os valores temporários dos restos de divisão.
		 */
		
		notas100 = valor / 100;
		valor %= 100;
		
		notas50 = valor / 50;
		valor %= 50;
		
		notas20 = valor / 20;
		valor %= 20;
		
		notas10 = valor / 10;
		valor %= 10;
		
		notas5 = valor / 5;
		valor %= 5;
		
		notas2 = valor / 2;
		valor %= 2;
		
		/*
		 * Há, pelo menos, duas formas melhores de fazer essa questão,
		 * mas acredito que esta seja a mais didática para repassar
		 * a lógica dela.
		 */
		
		System.out.printf("%d nota(s) de R$ 100,00\n", notas100);
		System.out.printf("%d nota(s) de R$ 50,00\n", notas50);
		System.out.printf("%d nota(s) de R$ 20,00\n", notas20);
		System.out.printf("%d nota(s) de R$ 10,00\n", notas10);
		System.out.printf("%d nota(s) de R$ 5,00\n", notas5);
		System.out.printf("%d nota(s) de R$ 2,00\n", notas2);
		System.out.printf("%d nota(s) de R$ 1,00\n", valor);
	}

}
