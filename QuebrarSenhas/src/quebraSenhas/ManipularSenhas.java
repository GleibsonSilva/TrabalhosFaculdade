package quebraSenhas;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

public class ManipularSenhas {

	public List<String> listarPossibilidadesNumericas(){
		List<String> lista = new ArrayList<String>();
		for (long i = 0; i < 99999; i++){
			String a = Long.toString(i);
			lista.add(a);
		}
		return lista;
	}
	
	public List<String> listarPossibilidadesAlfabeticas(){
		List<String> lista = new ArrayList<String>();
		for (int i = 65; i < 91; i++) {
			char a = i;
			lista.add(String.valueOf(a));
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
