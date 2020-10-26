package iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/*
Leia os quatro valores correspondentes aos eixos x e y de dois pontos 
quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles, 
mostrando 4 casas decimais após a vírgula, segundo a fórmula:

Distancia = raizQuadrada((x2 - x1)^2 + (y2 - y1)^2)

ENTRADA
O arquivo de entrada contém duas linhas de dados. A primeira linha contém 
dois valores de ponto flutuante: x1 y1 e a segunda linha contém dois valores 
de ponto flutuante x2 y2.

SAÍDA
Calcule e imprima o valor da distância segundo a fórmula fornecida, com 4 casas 
após o ponto decimal.
 */

public class URI_1015 {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		float x1 = sc.nextFloat();
		float y1 = sc.nextFloat();
		float x2 = sc.nextFloat();
		float y2 = sc.nextFloat();
		sc.close();
		
		float distancia = (float) Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		
		System.out.printf("%.4f\n", distancia);
	}

}
