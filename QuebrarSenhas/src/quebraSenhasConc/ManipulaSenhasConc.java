package quebraSenhasConc;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class ManipulaSenhasConc {

	public String gerarSenha(){
		char[] letras = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q',
				'r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9'};
		int aleatorio;
		for(int i = 1; i <= 5; i++){
			aleatorio = (int) (Math.random() * (letras.length) );
			String senha = String.valueOf(letras[aleatorio]);
			return senha;
		}
		return null;
	}
	
	public Boolean comparar(String minha, String comp){
		if (minha == comp){
			return true;
		}
		return false;
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
}
