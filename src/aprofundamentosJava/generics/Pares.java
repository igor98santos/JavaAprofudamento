package aprofundamentosJava.generics;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;


public class Pares<c extends Number, v> {
	private final Set<Par<c, v>> items = new LinkedHashSet<>();

	public void adicionar(c chave, v valor) {
		if (chave == null)
			return;

		Par<c, v> novoPar = new Par<c, v>(chave, valor);

		if (items.contains(novoPar)) {
			items.remove(novoPar);
		}
		items.add(novoPar);
	}

	public v getValor(c chave) {
		if (chave == null)
			return null;
		Optional<Par<c, v>> parOptional = items.stream().filter(par -> chave.equals(par.getChave())).findFirst();
		return parOptional.isPresent() ? parOptional.get().getValor() : null;
	}
}
