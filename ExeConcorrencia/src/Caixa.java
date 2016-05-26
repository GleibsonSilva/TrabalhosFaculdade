
public class Caixa {
	Cliente clienteDaVez = null;

	public synchronized void atender(Cliente c, int op, double v, double s) throws InterruptedException {
		while (clienteDaVez != null) {
			wait();
		}
		clienteDaVez = c;
		switch (op) {
		case 1:
			sacar(c, v, s);
			break;
		case 2:
			depositar(c, v, s);
			break;
		}
	}

	private synchronized void sacar(Cliente c, double valor, double saldoCaixa) throws InterruptedException {
		if (saldoCaixa <= valor) {
			System.out.println("Impossível sacar, valor indisponível no banco!");
			notifyAll();
		} else {
			if (valor > 0) {
				saldoCaixa -= valor;
				clienteDaVez = null;
				System.out.println("Saldo atual: " + saldoCaixa);
				notifyAll();
			}
		}
	}

	private synchronized void depositar(Cliente c, double valor, double saldoCaixa) {
		if (valor > 0) {
			saldoCaixa += valor;
			clienteDaVez = null;
			System.out.println("Saldo atual: " + saldoCaixa);
			notifyAll();
		}
	}
}
