package exercicio;

import java.io.*;

public class Serializacao {

	public Serializacao() {
	}

	public void serializar(String arq, Object obj) throws Exception {
		FileOutputStream fos = new FileOutputStream(arq);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);
		oos.close();
	}

	public Object deserializar(String arq) throws Exception {
		FileInputStream fis = new FileInputStream(arq);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object o = ois.readObject();
		ois.close();
		return o;
	}

	public byte[] getBytesObject(Object obj) throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ObjectOutputStream ous = new ObjectOutputStream(baos);
		ous.writeObject(obj);
		return baos.toByteArray();
	}
	
	public byte[] getBytesArqObject(String nome) throws IOException {
		File arq = new File(nome);
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(arq));
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		int x = 0;
		while((x = bis.read()) != -1){
			baos.write(x);
		}
		return baos.toByteArray();
	}
	
}
