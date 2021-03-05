package lambda;

import java.util.List;

public class Main {

	public static void main(String[] args) {

		EnviadorEmail enviadorEmail = new EnviadorEmail();

		List<Fatura> faturasVencidas = new FaturaDAO().buscarFaturasVencidas();

		for (Fatura f : faturasVencidas) {
			enviadorEmail.enviar(f.getEmailDevedor(), f.resumo());
		}
	}
}
