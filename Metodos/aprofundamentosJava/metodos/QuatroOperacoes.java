package aprofundamentosJava.metodos;

public class QuatroOperacoes{
	private double multi;
	private double divisao;
	private int soma;
	private int subtracao;
	private int numero1;
	private int numero2;


	public void multi() {
		numero1 = 2;
		numero2 = 4;
		multi = numero1 * numero2;
		System.out.println("A multiplicação é " + multi);
	}
	public void soma() {
		numero1 = 2;
		numero2 = 4;
		soma = numero1 + numero2;
		System.out.println("A Soma é " + soma);
	}
	
	public void subtracao() {
		numero1 = 2;
		numero2 = 4;
		subtracao = numero1 - numero2;
		System.out.println("A sub é " + subtracao);
	}
	public void divisao() {
		numero1 = 2;
		numero2 = 4;
		divisao = numero1 / numero2;
		System.out.println("A Divisao é " + divisao);
	}
	

	public double getMulti() {
		return multi;
	}

	public void setMulti(double multi) {
		this.multi = multi;
	}

	public double getDivisao() {
		return divisao;
	}

	public void setDivisao(double divisao) {
		this.divisao = divisao;
	}

	public int getSoma() {
		return soma;
	}

	public void setSoma(int soma) {
		this.soma = soma;
	}

	public int getSubtracao() {
		return subtracao;
	}

	public void setSubtracao(int subtracao) {
		this.subtracao = subtracao;
	}

	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public int getNumero2() {
		return numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}

	
	

}
