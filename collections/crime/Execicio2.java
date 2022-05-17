package crime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Execicio2 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		List<String> perguntas = new ArrayList<String>();

		perguntas.add("Telefonou para a vítima?");
		perguntas.add("Esteve no local do crime?");
		perguntas.add("Mora perto da vítima?");
		perguntas.add("Devia para a vítima?");
		perguntas.add("Já trabalhou com a vítima?");

		ler.nextInt();
		for (int i = 0; i < perguntas.size(); i++) {
			System.out.println("Vou te fazer algumas perguntas a respeito do crime e você tera que me responder 1- para sim e 2- para não okay");
			
			
		}

		ler.close();
	}
}

/*
 * Exercícios Propostos
 * 
 * Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa
 * sobre um crime. As perguntas são:
 * 
 * "Telefonou para a vítima?"
 * 
 * "Esteve no local do crime?"
 * 
 * "Mora perto da vítima?"
 * 
 * "Devia para a vítima?"
 * 
 * "Já trabalhou com a vítima?"
 * 
 * Se a pessoa responder positivamente a 2 questões ela deve ser classificada
 * como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassina". Caso
 * contrário, ela será classificado como "Inocente".
 */