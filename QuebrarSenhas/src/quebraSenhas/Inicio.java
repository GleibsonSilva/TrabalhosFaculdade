package quebraSenhas;

import java.util.*;

public class Inicio {

	private static ManipularSenhas manipular = new ManipularSenhas();
	
	public static void main(String[] args) {
		String senha1 = "17a0a00212dde12b063af7dc22fdf02b";
		String senha2 = "75abfe3020804dd73a2a6040da9df96c";
		String senha3 = "c77aeec24015ad7e6e0b1db9d9deed68";
		
		List<String> listaSenhas = manipular.listarSenhas();
		
		contadorTempo(senha1, listaSenhas);
		contadorTempo(senha2, listaSenhas);
		contadorTempo(senha3, listaSenhas);
	}
	
	public static void contadorTempo(String md5, List<String> lista){
		long ini = System.currentTimeMillis();
		quebrarSenha(md5, lista);
		long fim = System.currentTimeMillis();
		long tempo = (fim - ini) / 1000;
		System.out.println("Tempo: " + tempo + " s");
	}
	
	public static void quebrarSenha(String md5, List<String> lista){
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

//	public static void quebrarSenha(String md5){
//		boolean achou = false;
//		while (!achou){
//			String aux = manipular.gerarSenha();
//			String candidata = manipular.criarMD5(aux);
//			if (candidata == md5){
//				System.out.println(md5 + " encontrada!\n");
//				System.out.println("Senha: " + aux + "\n");
//				achou = true;
//			} else {
//				achou = false;
//			}
//		}
//	}
}
