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
		String candidata = "";
		String aux = "";
		while (!manipular.comparar(candidata, md5)){
			aux = manipular.gerarSenha();
			candidata = manipular.criarMD5(aux);
			if (manipular.comparar(candidata, md5)){
				System.out.println("Senha " + md5 + "encontrada!\n");
				System.out.println("Senha: " + aux + "\n");
			} else {
				aux = "";
				candidata = "";
			}
		}
	}
}
