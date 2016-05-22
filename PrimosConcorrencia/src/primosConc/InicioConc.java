package primosConc;

public class InicioConc {

	public static void main(String[] args) {
		long lim1 = 100000;
		long lim2 = 200000;
		long lim3 = 400000;
		long lim4 = 700000;
		long lim5 = 1000000;
		
		Thread t1 = new Thread(new GeraPrimos(lim1));
		Thread t2 = new Thread(new GeraPrimos(lim2));
		Thread t3 = new Thread(new GeraPrimos(lim3));
		Thread t4 = new Thread(new GeraPrimos(lim4));
		Thread t5 = new Thread(new GeraPrimos(lim5));
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}
