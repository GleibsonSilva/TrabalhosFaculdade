package quebraSenhas;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

public class ManipularSenhas {

	public String gerarSenha(){
		char[] letras = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q',
				'r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9'};
		int aleatorio;
		char[] linha = new char[5];
		for(int i = 0; i < linha.length; i++){
			aleatorio = (int) (Math.random() * (letras.length));
			linha[i] = letras[aleatorio];
		}
		String senha = String.valueOf(linha);;
		return senha;
	}
	
	public String criarMD5(String senha){
		String sen = "";
		MessageDigest md = null;
		try {
			md = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		BigInteger hash = new BigInteger(1, md.digest(senha.getBytes()));
		sen = hash.toString(16);
		return sen;
	}
	
//	Este método gera uma lista com todas as combinações possíveis para depois compará-las,
//	porém leva muito tempo para tal (Não esta sendo usado).
	public List<String> listarSenhas(){
		List<String> lista = new ArrayList<String>();
		long count = 0;
		while (count < 45239040) {
			String senha = gerarSenha();
			if (!lista.contains(senha)) {
				lista.add(senha);
				count++;
			}else{
				senha = "";
			}
		}
		return lista;
	}
}
//376992