package iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/*
Escreva um programa que leia três valores com ponto flutuante de dupla precisão: 
A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.

ENTRADA
O arquivo de entrada contém três valores com um dígito após o ponto decimal.

SAÍDA
O arquivo de saída deverá conter 5 linhas de dados. Cada linha corresponde a uma das 
áreas descritas acima, sempre com mensagem correspondente e um espaço entre os dois 
pontos e o valor. O valor calculado deve ser apresentado com 3 dígitos após o ponto 
decimal.
 */

public class URI_1012 {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		sc.close();
		
		//Fórmula das áreas
		
		double aTriRetan = (a * c) / 2;
		double aCirculo = 3.14159 * Math.pow(c, 2);
		double aTrapezio = ((a + b) * c) / 2;
		double aQuadrado = Math.pow(b, 2);
		double aRetangulo = a * b;
		
		System.out.printf("TRIANGULO: %.3f\n", aTriRetan);
		System.out.printf("CIRCULO: %.3f\n", aCirculo);
		System.out.printf("TRAPEZIO: %.3f\n", aTrapezio);
		System.out.printf("QUADRADO: %.3f\n", aQuadrado);
		System.out.printf("RETANGULO: %.3f\n", aRetangulo);		
	}

}
