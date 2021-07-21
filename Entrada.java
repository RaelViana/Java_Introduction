import java.util.Scanner;

/*
	Scanner Utilização
*/

 public class Entrada {
	
	public static void main(String[] args){
	
		System.out.println("Digite um numero inteiro.");//imprime alguma instrução ao usuário
		
		Scanner s = new Scanner(System.in);//cria um objeto scaner (recebe dados do usuário)
		
		System.out.println("voce digitou > " + s.nextLine()); //imprime na proxima linha dados coletados do usuário
		
    }

 }