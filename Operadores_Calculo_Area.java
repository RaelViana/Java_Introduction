import java.util.Scanner;         //importação da classe Scanner

/*
	Operadores - Caulculo Cilíndrico
	
	Calculando Diâmetro, Circunferencia e Area 
		
	
*/

  public class Operadores_Calculo_Area{
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);       //Criando um objeto Scanner     
		System.out.println("Informe o Raio : ");  //Msg ao usuário
		double raio = s.nextDouble();             //recebe um valor real digitado pelo usuário
		
		/* Diâmetro = 2 x raio  */		
		double diametro = 2 * raio;       // operação caulcula o diametro
		
		System.out.println("Diâmetro = " + diametro); // imprime valor do diametro
		
		
		/* Circunferência = 2 Pi r */		
		double pi = Math.PI;             // aplica a classe Math para utilizar PI
		double circunferencia = 2 * pi * raio;   // operação caulcula a circunferencia
		
		System.out.println("Circunferência = " + circunferencia); //imprime valor da circunferencia
		
		
		/* Area =  Pi r² */		
		double area = pi * (raio *raio);	// operação caulcula a area
		
		System.out.println("Area = " + area); //imprime valor da area
		
	}
 }
	
