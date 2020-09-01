package iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/*
Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, 
o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 
e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.

ENTRADA
O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores, 
respectivamente dois inteiros e um valor com 2 casas decimais.

SAÍDA
A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de 
deixar um espaço após os dois pontos e um espaço após o "R$". O valor deverá ser 
apresentado com 2 casas após o ponto.
*/

@SuppressWarnings("unused") //Elimina os Warnings de unused das variáveis 
							//pecaCod1 e pecaCod2
public class URI_1010 {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		int pecaCod1 = sc.nextInt();
		int pecaQtd1 = sc.nextInt();
		float pecaValor1 = sc.nextFloat();
		
		int pecaCod2 = sc.nextInt();
		int pecaQtd2 = sc.nextInt();
		float pecaValor2 = sc.nextFloat();
		sc.close();
		
		float valorTotal = pecaQtd1 * pecaValor1 + pecaQtd2 * pecaValor2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotal);
	}

}
