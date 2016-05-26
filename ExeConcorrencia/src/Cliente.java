
public class Cliente implements Runnable {

	Caixa caixa = new Caixa();
	int opSaque = 1;
	int opDepo = 2;
	double valor = 200.0;
	double saldo1 = 0.0;

	@Override
	public void run() {
		try {
			System.out.println("\nInciciando saque...");
			caixa.atender(this, opSaque, valor, saldo1);
			System.out.println("\nFinalizando saque.");
			System.out.println("\nIniciando depósito...");
			caixa.atender(this, opDepo, valor, saldo1);
			System.out.println("\nFinalizando depósito.");
		} catch (InterruptedException i) {
			System.out.println(i);
		}
	}

}
