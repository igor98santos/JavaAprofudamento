package crime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Execicio2 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		List<String> perguntas = new ArrayList<String>();

		perguntas.add("Telefonou para a v�tima?");
		perguntas.add("Esteve no local do crime?");
		perguntas.add("Mora perto da v�tima?");
		perguntas.add("Devia para a v�tima?");
		perguntas.add("J� trabalhou com a v�tima?");

		ler.nextInt();
		for (int i = 0; i < perguntas.size(); i++) {
			System.out.println("Vou te fazer algumas perguntas a respeito do crime e voc� tera que me responder 1- para sim e 2- para n�o okay");
			
			
		}

		ler.close();
	}
}

/*
 * Exerc�cios Propostos
 * 
 * Utilizando listas, fa�a um programa que fa�a 5 perguntas para uma pessoa
 * sobre um crime. As perguntas s�o:
 * 
 * "Telefonou para a v�tima?"
 * 
 * "Esteve no local do crime?"
 * 
 * "Mora perto da v�tima?"
 * 
 * "Devia para a v�tima?"
 * 
 * "J� trabalhou com a v�tima?"
 * 
 * Se a pessoa responder positivamente a 2 quest�es ela deve ser classificada
 * como "Suspeita", entre 3 e 4 como "C�mplice" e 5 como "Assassina". Caso
 * contr�rio, ela ser� classificado como "Inocente".
 */