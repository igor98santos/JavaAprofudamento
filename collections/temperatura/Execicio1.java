package temperatura;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Execicio1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		List<Double> temperatura = new ArrayList<Double>();
		for (int i = 0; i < 6; i++) {
			System.out.println("Digite a Temperatura do " + (i + 1) + "� m�s: ");
			temperatura.add(ler.nextDouble());
		}

		List<String> mes = new ArrayList<String>();
		mes.add("Janeiro");
		mes.add("Fevereiro");
		mes.add("Mar�o");
		mes.add("Abril");
		mes.add("maio");
		mes.add("Junho");

		double total = 0;

		for (int i = 0; i < temperatura.size(); i++) {
			System.out.println("A temperatura no mes de " + mes.get(i) + " foi de: " + temperatura.get(i));
			total += temperatura.get(i);

		}

		System.out.println("Soma total da temperatura �: " + total);
		Double media = total / 6;
		System.out.println("Esse primeiro semestre de 2022 a temperatura media � de: " + media + " Graus");
		ler.close();
	}
}
/*
 * Exerc�cios Propostos
 * 
 * Fa�a um programa que receba a temperatura m�dia dos 6 primeiros meses do ano
 * e armazene-as em uma lista.
 * 
 * Ap�s isto, calcule a m�dia semestral das temperaturas e mostre todas as
 * temperaturas acima desta m�dia, e em que m�s elas ocorreram (mostrar o m�s
 * por extenso: 1 � Janeiro, 2 � Fevereiro e etc).
 */
