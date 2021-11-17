package AEP;

public class Agricultor {
	private String nome;
	private String cod_agricultor;
	private Endereço endAgricultor;
	
	public Agricultor(String nome, String cod_agricultor) {
		this.nome = nome;
		this.cod_agricultor = cod_agricultor;
	}
	
	public void endAgricultor(Endereço endereço) {
		this.setEndAgricultor(endereço);
	}

	public String getNome() {
		return nome;
	}
	
	public String getCodAgricultor() {
		return cod_agricultor;
	}
	
	public void setEndAgricultor(Endereço endAgricultor) {
		this.endAgricultor = endAgricultor;
	}
	
	public Endereço getEndAgricultor() {
		return endAgricultor;
	}


}
