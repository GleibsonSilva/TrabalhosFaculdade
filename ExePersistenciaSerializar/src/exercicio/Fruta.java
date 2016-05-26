package exercicio;

import java.io.*;

public class Fruta implements Serializable {
	private String nome;
	private Cor cor;

	public Fruta(String nome, Cor cor) {
		this.nome = nome;
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}

	public String getNome() {
		return nome;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
