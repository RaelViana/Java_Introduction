/*
	Operadores - Logico
	
	&& e (and) 
	|| ou(ou)
	! não(not)
*/

 public class OperadorLogico {
	
	public static void main(String[] args){
		
		int x = 7;
		
		System.out.println((x > 4) && (x < 9)); //retorna 'true', se os dois valores forem verdadeiros
		
		System.out.println((x > 10) || (x < 4));//  retorna 'true' caso um dos valores seja verdadeiro
		
		System.out.println(!( x > 1)); //retora o oposto pois ele nega o resultado, inverte o resultado
	
		
	}
	
}