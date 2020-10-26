package iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/*
Calcule o consumo médio de um automóvel sendo fornecidos a distância total 
percorrida (em Km) e o total de combustível gasto (em litros).

ENTRADA
O arquivo de entrada contém dois valores: um valor inteiro X representando 
a distância total percorrida (em Km), e um valor real Y representando o total 
de combustível gasto, com um dígito após o ponto decimal.

SAÍDA
Apresente o valor que representa o consumo médio do automóvel com 3 casas 
após a vírgula, seguido da mensagem "km/l".
 */

public class URI_1014 {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		int x = sc.nextInt();
		float y = sc.nextFloat();
		sc.close();
		
		System.out.printf("%.3f km/l\n", x/y);
	}

}
