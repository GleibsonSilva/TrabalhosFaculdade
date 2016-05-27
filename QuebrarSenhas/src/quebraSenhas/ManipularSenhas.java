package quebraSenhas;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

public class ManipularSenhas {

	public List<String> listarPossibilidadesNumericas(){
		List<String> lista = new ArrayList<String>();
		char[] todos = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q',
				'r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9'};
		char[] s = new char[5];
		String a = "";
		int count = 1;
		for (int i = 0; i < todos.length; i++){
			while (count <= 5){
				a += todos[i];
				count++;
			}
			lista.add(a);
			count = 1;
		}
			for (int j = 0; j < s.length; j++){
				s[j] = todos[i];
				String senha = new String(s);
				lista.add(senha);
			}
		}
		return lista;
	}
	
	public Boolean compararSenhas(String minha, String comp){
		if (minha == comp){
			return true;
		}
		return false;
	}
	
	public void mostrarSenhaQuebrada(){
		
	}
	
	public String criarSenhas(String senha){
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
