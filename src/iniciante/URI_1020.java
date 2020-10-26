package iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/*
Leia um valor inteiro correspondente à idade de uma pessoa em dias e 
informe-a em anos, meses e dias

Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias 
e todo mês com 30 dias. Nos casos de teste nunca haverá uma situação que 
permite 12 meses e alguns dias, como 360, 363 ou 364. Este é apenas um 
exercício com objetivo de testar raciocínio matemático simples.

ENTRADA
O arquivo de entrada contém um valor inteiro.

SAÍDA
Imprima a saída conforme exemplo fornecido.
 */

public class URI_1020 {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		int idadeEmDias = sc.nextInt();
		sc.close();
		
		int anos = idadeEmDias / 365;
		if(anos != 0) {
			idadeEmDias %= anos * 365;
		}
		
		int meses = idadeEmDias / 30;
		if(meses != 0) {
			idadeEmDias %= meses * 30;
		}
		
		/*
		 * Não precisamos de uma variável "dias", pois a variável
		 * "idadeEmDias" é equivalente a ela, no final das contas.
		 */
		
		System.out.printf("%d ano(s)\n", anos);
		System.out.printf("%d mes(es)\n", meses);
		System.out.printf("%d dia(s)\n", idadeEmDias);
	}

}
