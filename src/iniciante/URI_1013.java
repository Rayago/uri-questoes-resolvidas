package iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/*
Faça um programa que leia três valores e apresente o maior dos três valores 
lidos seguido da mensagem “eh o maior”. Utilize a fórmula:

MaiorAB = (a + b + abs(a-b))/2

Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). 
Um segundo passo, portanto é necessário para chegar no resultado esperado.

ENTRADA
O arquivo de entrada contém três valores inteiros.

SAÍDA
Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".
 */

public class URI_1013 {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
		//Criarei uma variável intermediária para fazer os cálculos
		
		int temp = maiorAB(a, b);
		temp = maiorAB(temp, c);
		
		System.out.printf("%d eh o maior\n", temp);
	}
	
	public static int maiorAB(int a, int b) {
		return (a + b + Math.abs(a-b))/2;
	}

}
