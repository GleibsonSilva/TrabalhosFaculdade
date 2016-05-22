package primosConc;

import java.util.ArrayList;
import java.util.List;

public class GeraPrimos implements Runnable {
	private long lim;
	
	public GeraPrimos(long lim){
		this.lim = lim;
	}

	@Override
	public void run() {
		tempoGastoAcharPrimos(lim);
	}

	private void tempoGastoAcharPrimos(long l) {
		List<Long> lista = new ArrayList<Long>();
		CalculosConc c = new CalculosConc();
		long tIni = System.currentTimeMillis();
		c.calcularPrimos(l, lista);
		long tFim = System.currentTimeMillis();
		System.out.println("Tempo gasto até " + l + ": " + c.contarTempo(tIni, tFim) + " milisegundos");
	}
}