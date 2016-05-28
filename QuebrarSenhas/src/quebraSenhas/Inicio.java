package quebraSenhas;

public class Inicio {

	private static ManipularSenhas manipular = new ManipularSenhas();
	
	public static void main(String[] args) {
		String senha1 = "17a0a00212dde12b063af7dc22fdf02b";
		String senha2 = "75abfe3020804dd73a2a6040da9df96c";
		String senha3 = "c77aeec24015ad7e6e0b1db9d9deed68";
		
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
