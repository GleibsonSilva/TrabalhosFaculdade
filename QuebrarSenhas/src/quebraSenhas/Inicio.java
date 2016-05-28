package quebraSenhas;

public class Inicio {

	private static ManipularSenhas manipular = new ManipularSenhas();
	
	public static void main(String[] args) {
		String senha1 = "";
		String senha2 = "";
		String senha3 = "";
		
		contadorTempo(senha1);
		contadorTempo(senha2);
		contadorTempo(senha3);

	}

	public static void quebrarSenha(String md5){
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
	
	public static void contadorTempo(String md5){
		long ini = System.currentTimeMillis();
		quebrarSenha(md5);
		long fim = System.currentTimeMillis();
		long tempo = (fim - ini) / 1000;
		System.out.println("Tempo: " + tempo + "s");
	}
}
