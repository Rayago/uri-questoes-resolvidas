package iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/*
Dois carros (X e Y) partem em uma mesma direção. O carro X sai com 
velocidade constante de 60 Km/h e o carro Y sai com velocidade 
constante de 90 Km/h.

Em uma hora (60 minutos) o carro Y consegue se distanciar 30 quilômetros 
do carro X, ou seja, consegue se afastar um quilômetro a cada 2 minutos.

Leia a distância (em Km) e calcule quanto tempo leva (em minutos) para o 
carro Y tomar essa distância do outro carro.

ENTRADA
O arquivo de entrada contém um número inteiro.

SAÍDA
Imprima o tempo necessário seguido da mensagem "minutos".
 */

public class URI_1016 {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		int distancia = sc.nextInt();
		sc.close();
		
		/* 
		 * Como o carro Y consegue se afastar 1km a cada 2 minutos, por estarmos, 
		 * recebendo a distância em km, dá pra resolver o problema apenas 
		 * multiplicando a distância por 2.
		*/
		
		System.out.printf("%d minutos\n", distancia * 2);
	}

}
