package iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/*
Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total 
de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor 
ganha 15% de comissão sobre suas vendas efetuadas, informar o total a receber 
no final do mês, com duas casas decimais.

ENTRADA
O arquivo de entrada contém um texto (primeiro nome do vendedor) e 2 valores 
de dupla precisão (double) com duas casas decimais, representando o salário 
fixo do vendedor e montante total das vendas efetuadas por este vendedor, 
respectivamente.

SAÍDA
Imprima o total que o funcionário deverá receber, conforme exemplo fornecido.
*/

@SuppressWarnings("unused") //Apaga o warning da variável "nome", que não é usada.
public class URI_1009 {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		String nome = sc.nextLine();
		double salFixo = sc.nextDouble();
		double vendas = sc.nextDouble();
		sc.close();
		
		double salFinal = salFixo + (vendas * 0.15);
		
		System.out.printf("TOTAL = R$ %.2f\n", salFinal);
	}

}
