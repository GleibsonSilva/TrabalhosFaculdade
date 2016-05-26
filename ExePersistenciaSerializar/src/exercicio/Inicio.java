package exercicio;

import java.io.IOException;

public class Inicio {

	private static Serializacao s = new Serializacao();
	
	public static void main(String[] args) throws Exception{
//		FRUTA
		Cor vermelho = new Cor();
		String nomeFruta = "objeto_fruta";
		Fruta fruta = new Fruta("Maça", vermelho);
		serializarObjeto(nomeFruta, fruta);
		compararTamanhos(nomeFruta, fruta);
//		deserializarObjeto(nomeFruta);
		System.out.println("________________________________________________");
		
//		COR
		String nomeCor = "objeto_cor";
		Cor cor = new Cor();
		serializarObjeto(nomeCor, cor);
		compararTamanhos(nomeCor, cor);
//		deserializarObjeto(nomeCor);
		System.out.println("________________________________________________");
		
	}
	
	public static void serializarObjeto(String nome, Object obj) throws Exception{
		s.serializar(nome, obj);
		System.out.println("\n"+nome+" serializado.");
	}
	
	public static void deserializarObjeto(String nome) throws Exception{
		Object obj = null;
		obj = (Object) s.deserializar(nome);
		System.out.println(nome+" deserializado.");
		System.out.println("Descrição: "+obj);
	}
	
	public static void compararTamanhos(String nome, Object obj) throws IOException {
		byte[] byteObject = s.getBytesObject(obj);
		System.out.println("Tamanho da serialização de "+nome+": "+obterTamanhoByteArray(byteObject)+" bytes");
		byte[] byteArqObject = s.getBytesArqObject(nome);
		System.out.println("Tamanho do arquivo de "+nome+": "+obterTamanhoByteArray(byteArqObject)+" bytes");
	}
	
	public static int obterTamanhoByteArray(byte[] b){
		int tam = b.length;
		return tam;
	}
}
