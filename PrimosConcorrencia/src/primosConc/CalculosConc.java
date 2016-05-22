package primosConc;

import java.util.List;

public class CalculosConc {

	public void calcularPrimos(long limite, List<Long> listaPrimos) {
		boolean primo;
		listaPrimos.add((long) 2);
		for (long num = 3; num <= limite; num += 2){
			primo = true;
			for (long div = 1; div < num; div++){
				if(num % div == 0){
					primo = false;
				}
			}
			if (primo) {
				listaPrimos.add(num);
			}
		}
	}
	
	public long contarTempo(long tIni, long tFim){
		long tTotal = tFim - tIni;
		return tTotal;
	}
}
