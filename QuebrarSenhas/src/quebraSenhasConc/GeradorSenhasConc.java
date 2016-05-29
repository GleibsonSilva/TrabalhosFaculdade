package quebraSenhasConc;

import java.util.List;

public class GeradorSenhasConc implements Runnable{
	private String senha;
	private List<String> lista;
	
	public GeradorSenhasConc(String senha, List<String> lista){
		this.senha = senha;
		this.lista = lista;
	}
	
	@Override
	public void run() {
		quebrarSenha(senha, lista);
	}

	private static void quebrarSenha(String md5, List<String> lista){
		ManipulaSenhasConc manipular = new ManipulaSenhasConc();
		for (String s : lista) {
			String candidata = manipular.criarMD5(s);
			if (candidata == md5) {
				System.out.println(md5 + " encontrada!\n");
				System.out.println("Senha: " + s + "\n");
				break;
			}
		}
		System.out.println("Não encontrada!");
	}
}
