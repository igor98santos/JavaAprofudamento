package bomdia;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		Date dataHoraAtual = new Date();
		String data = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);
		String hora = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);
		System.out.println(data);
		System.out.println(hora);
		int hr = 15;
		if(hora.compareTo(hora) > hr ) {
			System.out.println("Boa tarde Você está atrassado");
		}else {
			System.out.println("Ta em tempo");
		}
	}
}
