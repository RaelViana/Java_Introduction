/*
	Operadores - Especiais
	
	?: 		Operador Ternário
	,  		Separação de Expressões
		
	
*/

  public class OperadoresEspeciais{
	
	public static void main(String[] args){
		
		
		
		/* Exemplo operador ternário*/
		int idade = 7;
		
		String x = (idade >= 18) ? "Maior de idade" : "Menor de idade"; // avalia o valor da idade e retorne se é maior ou menor		
		
		System.out.println(x); //retorna valor de x
		
		
		/* Separador de Expressão*/
		
		String sexo = "M";
		String país = "Brasil";
		
		// podemos utilizar (,) para separar as expressões do mesmo tipo, exemplo abaixo
		
		String sexo = "M" , país = "Brasil";
	
		
	}
 }
	
