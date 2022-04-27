package aprofundamentosJava.generics;

import java.util.Objects;

public class Par<c, v> {
	private c chave;
	private v valor;

	public Par(c chave, v valor) {
		super();
		this.chave = chave;
		this.valor = valor;
	}

	public c getChave() {
		return chave;
	}

	public void setChave(c chave) {
		this.chave = chave;
	}

	public v getValor() {
		return valor;
	}

	public void setValor(v valor) {
		this.valor = valor;
	}

	@Override
	public int hashCode() {
		return Objects.hash(chave);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Par<?, ?> other = (Par<?, ?>) obj;
		return Objects.equals(chave, other.chave);
	}

}
