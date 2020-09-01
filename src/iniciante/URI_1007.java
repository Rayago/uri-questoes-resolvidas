package iniciante;

import java.io.IOException;
import java.util.Scanner;

/*
Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a 
diferença do produto de A e B pelo produto de C e D segundo a fórmula: 
DIFERENCA = (A * B - C * D).

ENTRADA
O arquivo de entrada contém 4 valores inteiros.

SAÍDA
Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme 
exemplo abaixo, com um espaço em branco antes e depois da igualdade.
*/

public class URI_1007 {
	
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		sc.close();
		
		System.out.printf("DIFERENCA = %d\n", a * b - c * d);	
	}
	
}
