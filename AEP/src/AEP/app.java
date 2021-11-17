package AEP;

public class app {

	public static void main(String[] args) {
		
		Agricultor A1 = new Agricultor("Paulo", "159753ab");
		A1.endAgricultor(new Endereço ("rua alguma coisa", 777, "Apto 04", "Sao Paulo", "SP", "BR"));
		Agricultor A2 = new Agricultor("Luis", "154575cb");
		A2.endAgricultor(new Endereço ("rua alguma coisa", 888, "Apto 05", "Taboao da Serra", "SP", "BR"));
		Agricultor A3 = new Agricultor("Lucas", "147852ab");
		A3.endAgricultor(new Endereço ("rua alguma coisa", 999, "--", "Maringa", "PR", "BR"));
		
		System.out.println("Agricultores : \n");
		
		System.out.println(A1.getNome()+" -> Código de cadastro : "+ A1.getCodAgricultor());
		System.out.print("Endereço : " + A1.getEndAgricultor().getLogradouro());
		System.out.print(" " + A1.getEndAgricultor().getNumero());
		System.out.print(" " + A1.getEndAgricultor().getComplemento());
		System.out.print(" " + A1.getEndAgricultor().getMunicipio());
		System.out.print(" " + A1.getEndAgricultor().getEstado());
		System.out.print(" " + A1.getEndAgricultor().getPais());

		System.out.println("\n\n" + A2.getNome()+" -> Código de cadastro : "+ A2.getCodAgricultor());
		System.out.print("Endereço : " + A2.getEndAgricultor().getLogradouro());
		System.out.print(" " + A2.getEndAgricultor().getNumero());
		System.out.print(" " + A2.getEndAgricultor().getComplemento());
		System.out.print(" " + A2.getEndAgricultor().getMunicipio());
		System.out.print(" " + A2.getEndAgricultor().getEstado());
		System.out.print(" " + A2.getEndAgricultor().getPais());

		System.out.println("\n\n" + A3.getNome()+" -> Código de cadastro : "+ A3.getCodAgricultor());
		System.out.print("Endereço : " + A3.getEndAgricultor().getLogradouro());
		System.out.print(" " + A3.getEndAgricultor().getNumero());
		System.out.print(" " + A3.getEndAgricultor().getComplemento());
		System.out.print(" " + A3.getEndAgricultor().getMunicipio());
		System.out.print(" " + A3.getEndAgricultor().getEstado());
		System.out.print(" " + A3.getEndAgricultor().getPais());

	}
	
}
