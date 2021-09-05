import javax.swing.JOptionPane;
/*
	Desafio Calculo - IMC
	
	Calculando indice massa Corporal 
		
	
*/

  public class Desafio_Imc{
	
	public static void main(String[] args){
		
		String peso = JOptionPane.showInputDialog("Qual seu peso: "); // cria uma janela que recebe valor digitado
		
		String altura = JOptionPane.showInputDialog("Qual sua Altura: ");
			
		double pesoEmQuilogramas = Double.parseDouble(peso);      //converte o valor digtado para o cálculo 
		double alturaEmMetros = Double.parseDouble(altura);
		double imc = pesoEmQuilogramas /(alturaEmMetros * alturaEmMetros); //cálculo do imc
		
		String msg =(imc >= 20 && imc <=25) ? "Peso Ideal" : "Fora do peso"; //estabelece uma condição para o resultado
		
		msg = "IMC = " + imc + "\n" + msg;		
		
		JOptionPane.showMessageDialog(null, msg); // exibe uma janela com os valores
		 

		
		
		
	}
 }
	
