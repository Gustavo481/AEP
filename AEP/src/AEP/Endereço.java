package AEP;

public class Endereço {
	private String Logradouro;
	private int numero;
	private String complemento;
	private String municipio;
	private String estado;
	private String pais;
	
	
	public Endereço(String Logradouro, int numero, String complemento, String municipio, String estado, String pais) {
		this.Logradouro = Logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.municipio = municipio;
		this.estado = estado;
		this.pais = pais;
	}

	public String getLogradouro() {
		return Logradouro;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public String getComplemento() {
		return complemento;
	}
	
	public String getMunicipio() {
		return municipio;
	}
	
	public String getEstado() {
		return estado;
	}

	public String getPais() {
		return pais;
	}
	
}
