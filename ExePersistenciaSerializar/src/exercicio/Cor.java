package exercicio;

import java.io.Serializable;
import java.util.*;

public class Cor implements Serializable{
	
	private List<String> cores = new ArrayList<String>();
	
	public void encherCores(String cor){
		int count = 10;
		while(count != 0){
			cores.add(cor);
			count--;
		}
	}
}
