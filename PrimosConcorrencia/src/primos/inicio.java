package primos;

import java.util.ArrayList;
import java.util.List;

public class inicio {

	private static Calculos c = new Calculos();
	private static List<Long> lista = new ArrayList<Long>();
	
	public static void main(String[] args) {
		
		long lim1 = 100000;
		long lim2 = 200000;
		long lim3 = 400000;
		long lim4 = 700000;
		long lim5 = 1000000;

		tempoGastoAcharPrimos(lim1);
		tempoGastoAcharPrimos(lim2);
		tempoGastoAcharPrimos(lim3);
		tempoGastoAcharPrimos(lim4);
		tempoGastoAcharPrimos(lim5);
	}
	
	public static void tempoGastoAcharPrimos(long lim){
		long tIni = System.currentTimeMillis();
		c.calcularPrimos(lim, lista);
		long tFim = System.currentTimeMillis();
		System.out.println("Tempo gasto até " + lim + ": " 
		+ c.contarTempo(tIni, tFim) + " milisegundos");
	}
	
}
