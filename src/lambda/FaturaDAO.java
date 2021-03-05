package lambda;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class FaturaDAO {

	public List<Fatura> buscarFaturasVencidas() {
	    // Você iria no banco de dados...
	    Fatura f1 = new Fatura("joao@joao.com", 350.0, LocalDate.now().minusDays(3));
	    Fatura f2 = new Fatura("maria@maria.com", 150.0, LocalDate.now().minusMonths(2).minusDays(2));
	    Fatura f3 = new Fatura("jose@jose.com", 200.0, LocalDate.now().minusDays(5));
	 
	    return Arrays.asList(f1, f2, f3);
	  }
}
