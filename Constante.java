/*
	'Constante e Modificador Final'
	O modificador final restringe a mudança do valor da variavel quando aplicado
	
*/
public class Constante {
	
	public static void main(String[] args){
	
		int populacaoBrasieira = 220150344; //Variáveis podem ser alteradas (sem o modificador)
		populacaoBrasieira = 455;         //alterando valor da variável 
		
		final double PI = 3.14; //O modificador final não permite alteração no valor da variável		
		PI = 123;           //Essa alteração não será aplicada o 'modificador final' irá restringir
		
		final char SEXO_MASCULINO = 'M';
		final char SEXO_FEMININO = 'F';
	
	
		System.out.println(populacaoBrasieira);
		System.out.println(PI);
		System.out.println(SEXO_MASCULINO);
		System.out.println(SEXO_FEMININO);
	}
}