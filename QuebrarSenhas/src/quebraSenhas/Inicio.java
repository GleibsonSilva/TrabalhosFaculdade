package quebraSenhas;

import java.util.ArrayList;
import java.util.List;

public class Inicio {

	public static void main(String[] args) {

		List<String> lista = new ArrayList<String>();
		char[] letras = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q',
				'r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9'};
		int aleatorio;
		
		for(int i = 1; i <= 5; i++){
			aleatorio = (int) (Math.random() * (letras.length) );
			String senha = String.valueOf(letras[aleatorio]);
			while (lista.size() < 36){
				if (!lista.contains(senha)){
					lista.add(senha);
				}
			}
		}
		for (String i : lista){
			System.out.println(i);
		}
	}

}
