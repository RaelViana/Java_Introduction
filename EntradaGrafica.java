import javax.swing.JOptionPane; //faz a importação de uma classe de um pacote externo

/*
	Entrada Gráfica de Dadosa com JOptionPane
*/

 public class EntradaGrafica {
	
	public static void main(String[] args){
	
		String nome = JOptionPane.showInputDialog("Qual Seu Nome"); //cria uma Janela com entrada de texto
		JOptionPane.showMessageDialog(null, nome);//imprime o valor digitado pelo usuário na caixa de  dialogo
		
	}
	
}
 