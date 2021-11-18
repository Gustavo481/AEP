package Lista;

import java.util.ArrayList;
import java.util.Scanner;


public class Lista {

	public static void main(String[] args) {
		
		try (Scanner read = new Scanner(System.in)) {
			ArrayList<String> Cadastro = new ArrayList<String>();
			
			Cadastro.add("J�ao Paulo");
			Cadastro.add("Lucas Marcos");
			Cadastro.add("Carlos Moura");
			
			System.out.printf("Percorrer a lista\n");
			int tam = Cadastro.size();
			for (int x=0; x<tam; x++) {
				System.out.printf("Posi��o %d - %s \n",x, Cadastro.get(x));
			}
			
			System.out.println("Qual posi��o ser� exclu�da ?");
			int x = read.nextInt();
			
			try {
				Cadastro.remove(x);
			} catch (IndexOutOfBoundsException E) {
				System.out.printf("\n A posi��o (%s) digitada n�o consta na lista!!!", E.getMessage());
			}
			
			x = 0;
			
			for (String pessoas: Cadastro) {
				System.out.printf("Posi��o %d - %s \n", x, pessoas);
				x++;
			}
		}
	}
	
}
