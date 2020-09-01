package iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/*
Escreva um programa que leia o número de um funcionário, seu número de horas 
trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. 
A seguir, mostre o número e o salário do funcionário, com duas casas decimais.

ENTRADA
O arquivo de entrada contém 2 números inteiros e 1 número com duas casas decimais, 
representando o número, quantidade de horas trabalhadas e o valor que o funcionário 
recebe por hora trabalhada, respectivamente.

SAÍDA
Imprima o número e o salário do funcionário, conforme exemplo fornecido, com um 
espaço em branco antes e depois da igualdade. No caso do salário, também deve haver 
um espaço em branco após o $.
*/

public class URI_1008 {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US); //Permite utilizar valores decimais com . no lugar de
								 //, -> Exemplo: 5.50
		
		int numeroFunc = sc.nextInt();
		int horasTrabalhadas = sc.nextInt();
		double valorHoraTrabalhada = sc.nextDouble();
		sc.close();
		
		double salario = horasTrabalhadas * valorHoraTrabalhada;
		
		System.out.printf("NUMBER = %d\n"
				+ "SALARY = U$ %.2f\n", numeroFunc, salario);
	}

}
