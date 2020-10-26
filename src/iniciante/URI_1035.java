package iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/*
Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C 
e se D for maior do que A, e a soma de C com D for maior que a soma de 
A e B e se C e D, ambos, forem positivos e se a variável A for par escrever 
a mensagem "Valores aceitos", senão escrever "Valores nao aceitos".

ENTRADA
Quatro números inteiros A, B, C e D.

SAÍDA
Mostre a respectiva mensagem após a validação dos valores.

 */

public class URI_1035 {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		sc.close();
		
		if(b > c && d > a && (c + d) > (a + b) && c > 0 && d > 0 && a % 2 == 0) {
			System.out.printf("Valores aceitos\n");
			return;
		}
		
		//Poderia fazer um else, mas desta forma pode-se aplicar o "return" em um contexto.
		
		System.out.printf("Valores nao aceitos\n");
	}

}
