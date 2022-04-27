package aprofundamentosJava.generics;

public class ParesTeste {

	public static void main(String[] args) {
		
		Pares<Integer, String> resultadoConcurso = new Pares<>();
		
		resultadoConcurso.adicionar(1, "Maria");
		resultadoConcurso.adicionar(2, "Pedro");
		resultadoConcurso.adicionar(3, "Gui");
		resultadoConcurso.adicionar(4, "ana");
		resultadoConcurso.adicionar(5, "Rebeca");
		System.out.println(resultadoConcurso.getValor(1));
		System.out.println(resultadoConcurso.getValor(5));
		System.out.println(resultadoConcurso.getValor(4));
	}

}
