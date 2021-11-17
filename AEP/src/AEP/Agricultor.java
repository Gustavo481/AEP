package AEP;

public class Agricultor {
	private String nome;
	private String cod_agricultor;
	private Endere�o endAgricultor;
	
	public Agricultor(String nome, String cod_agricultor) {
		this.nome = nome;
		this.cod_agricultor = cod_agricultor;
	}
	
	public void endAgricultor(Endere�o endere�o) {
		this.setEndAgricultor(endere�o);
	}

	public String getNome() {
		return nome;
	}
	
	public String getCodAgricultor() {
		return cod_agricultor;
	}
	
	public void setEndAgricultor(Endere�o endAgricultor) {
		this.endAgricultor = endAgricultor;
	}
	
	public Endere�o getEndAgricultor() {
		return endAgricultor;
	}


}
