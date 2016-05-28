package quebraSenhasConc;

public class InicioConc {

	public static void main(String[] args) {
		String senha1 = "";
		String senha2 = "";
		String senha3 = "";
		
	}

	public static void iniciarContarTempo(String senha){
		Thread t1 = new Thread(new GeradorSenhasConc(senha));
		Thread t2 = new Thread(new GeradorSenhasConc(senha));
		Thread t3 = new Thread(new GeradorSenhasConc(senha));
		
		long ini = System.currentTimeMillis();
		
		
		long fim = System.currentTimeMillis();
		long tempo = (fim - ini) / 1000;
		System.out.println("Tempo: " + tempo + "s");
	}
	
	public static void iniciarVerificarThreads(Thread t1, Thread t2, Thread t3, Thread t4, Thread t5, Thread t6, 
			Thread t7, Thread t8, Thread t9, Thread t10){
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();
		if (!t1.isAlive())
			interromperTodas(t2,t3,t4,t5,t6,t7,t8,t9,t10);
		else if (!t2.isAlive())
			interromperTodas(t1,t3,t4,t5,t6,t7,t8,t9,t10);
		else if (!t3.isAlive())
			interromperTodas(t1,t2,t4,t5,t6,t7,t8,t9,t10);
		else if (!t2.isAlive())
			interromperTodas(t1,t3,t4,t5,t6,t7,t8,t9,t10);
		else if (!t2.isAlive())
			interromperTodas(t1,t3,t4,t5,t6,t7,t8,t9,t10);
		else if (!t2.isAlive())
			interromperTodas(t1,t3,t4,t5,t6,t7,t8,t9,t10);
		else if (!t2.isAlive())
			interromperTodas(t1,t3,t4,t5,t6,t7,t8,t9,t10);
		else if (!t2.isAlive())
			interromperTodas(t1,t3,t4,t5,t6,t7,t8,t9,t10);
		else if (!t2.isAlive())
			interromperTodas(t1,t3,t4,t5,t6,t7,t8,t9,t10);
	}
	
	public static void interromperTodas(Thread t1, Thread t2, Thread t3, Thread t4, Thread t5, Thread t6, 
			Thread t7, Thread t8, Thread t9){
		t1.interrupt();
		t2.interrupt();
		t3.interrupt();
		t4.interrupt();
		t5.interrupt();
		t6.interrupt();
		t7.interrupt();
		t8.interrupt();
		t9.interrupt();
	}
}
