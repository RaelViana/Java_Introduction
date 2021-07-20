/*
	Classes Wrappers Uilização
*/

public class Wrapper {
	
	public static void main(String[] args){
	
		Double preco = new Double ("12.45"); //Construtor cria um objeto tipo double
		double d = preco.doubleValue();   //método recupera o valor double do objeto preco
		int i = preco.intValue();   //método recupera o Valor inteiro do preco
		
		//CONVERSÃO 
		double d1 = Double.parseDouble("188.12"); //converte um valor double para string
		int i1 = Integer.parseInt("332");// Converte um valor inteiro para string
		float f1 = Float.parseFloat("3.14F"); //converte um valor float para string
}