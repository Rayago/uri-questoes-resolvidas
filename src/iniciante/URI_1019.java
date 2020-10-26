package iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/*
Leia um valor inteiro, que é o tempo de duração em segundos de um determinado 
evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.

ENTRADA
O arquivo de entrada contém um valor inteiro N.

SAÍDA
Imprima o tempo lido no arquivo de entrada (segundos), convertido para 
horas:minutos:segundos, conforme exemplo fornecido.
 */

public class URI_1019 {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		int tempoSegundos = sc.nextInt();
		sc.close();
		
		
		int horas = tempoSegundos / 3600;
		if (horas != 0) {
			tempoSegundos %= horas * 3600;
		}

		
		int minutos = tempoSegundos / 60;
		if (minutos != 0) {
			tempoSegundos %= minutos * 60;
		}
		
		
		/*
		 * Não precisamos de uma variável "segundos", pois a variável
		 * "tempoSegundos" é equivalente a ela, no final das contas.
		 */
		
		System.out.printf("%d:%d:%d\n", horas, minutos, tempoSegundos);
	}

}
