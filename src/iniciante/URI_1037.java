package iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/*
Você deve fazer um programa que leia um valor qualquer e apresente 
uma mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) 
este valor se encontra. Obviamente se o valor não estiver em nenhum destes intervalos, 
deverá ser impressa a mensagem “Fora de intervalo”.

O símbolo ( representa "maior que". Por exemplo:
[0,25]  indica valores entre 0 e 25.0000, inclusive eles.
(25,50] indica valores maiores que 25 Ex: 25.00001 até o valor 50.0000000

ENTRADA
O arquivo de entrada contém um número com ponto flutuante qualquer.

SAÍDA
A saída deve ser uma mensagem conforme exemplo abaixo.
 */

public class URI_1037 {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		float entrada = sc.nextFloat();
		sc.close();
		
		
		if(entrada < 0 || entrada > 100) {
			System.out.printf("Fora de intervalo\n");
			
		} else {
			
			System.out.printf("Intervalo ");
			
			if (entrada >= 0 && entrada <= 25) {
				System.out.printf("[0,25]\n");
			}
				
			if(entrada > 25 && entrada <= 50) {
				System.out.printf("(25,50]\n");
			}
			
			if(entrada > 50 && entrada <= 75) {
				System.out.printf("(50,75]\n");
			}
			
			if(entrada > 75 && entrada <= 100) {
				System.out.printf("(75,100]\n");
			}
		}

	}

}
