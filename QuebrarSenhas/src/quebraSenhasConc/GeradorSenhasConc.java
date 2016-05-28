package quebraSenhasConc;

public class GeradorSenhasConc implements Runnable{
	private String senha;
	
	public GeradorSenhasConc(String senha){
		this.senha = senha;
	}
	
	@Override
	public void run() {
		quebrarSenha(senha);
	}

	private static void quebrarSenha(String md5){
		ManipulaSenhasConc manipular = new ManipulaSenhasConc();
		boolean achou = false;
		while (!achou){
			String aux = manipular.gerarSenha();
			String candidata = manipular.criarMD5(aux);
			if (candidata == md5){
				System.out.println(md5 + " encontrada!\n");
				System.out.println("Senha: " + aux + "\n");
				achou = true;
			} else {
				achou = false;
			}
		}
	}
}
