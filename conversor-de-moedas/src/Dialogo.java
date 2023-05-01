import javax.swing.JOptionPane;
public class Dialogo {
	public static void main(String[] args) {
		int convmoeda;
		String valor;
		double valorreal;
		String msg;
		
		
		
		String[] opcoes = {"Conversor de moeda", "Conversor de temperatura"};
		String opcaoSelecionada = (String) JOptionPane.showInputDialog(null, "Selecione uma opção:\n"
				+ "	1	-Converter de Reais a Dollar\r\n"	
				+ " 2    - Converter de Reais a Euro\r\n"
				+ " 3    - Converter de Reais a Libras Esterlinas\r\n"
				+ " 4    - Converter de Reais a Peso argentino\r\n"
				+ " 5    - Converter de Reais a Peso Chileno",
                "Opções", JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);
		String receba = JOptionPane.showInputDialog ("Digite um valor");
		convmoeda = Integer.parseInt(receba);
		
		if(convmoeda == 1) {
		
			valor= JOptionPane.showInputDialog("Digite o valor em reais a ser convertido em Dolar");
			valorreal = Double.parseDouble(valor);
			final double dolar = 5.45;
			double valorconvertido = valorreal/dolar;
			msg= "O valor convertido em dolar é de:"+valorconvertido;
			JOptionPane.showMessageDialog(null, msg);
			
		}
		
		if(convmoeda==2) {
		
			valor= JOptionPane.showInputDialog("Digite o valor em reais a ser convertido em Euro");
			valorreal = Double.parseDouble(valor);
			final double euro = 5.45;
			double valorconvertido = valorreal/euro;
			msg= "O valor convertido em euro é de:"+valorconvertido;
			JOptionPane.showMessageDialog(null, msg);
		}
		
		if(convmoeda==3) {
			
			valor= JOptionPane.showInputDialog("Digite o valor em reais a ser convertido em Libras Esterlinas");
			valorreal = Double.parseDouble(valor);
			final double esterlinas = 6.80;
			double valorconvertido = valorreal/esterlinas;
			msg= "O valor convertido em libras esterlinas é de:"+valorconvertido;
			JOptionPane.showMessageDialog(null, msg);
		}
		
		if(convmoeda==4) {
			
			valor= JOptionPane.showInputDialog("Digite o valor em reais a ser convertido em Peso Argentino");
			valorreal = Double.parseDouble(valor);
			final double pesoA = 0.40;
			double valorconvertido = valorreal/pesoA;
			msg= "O valor convertido em pesos aregntinos é de:"+valorconvertido;
			JOptionPane.showMessageDialog(null, msg);
		}
		
		if(convmoeda==5) {
		
			valor= JOptionPane.showInputDialog("Digite o valor em reais a ser convertido em Peso Chileno");
			valorreal = Double.parseDouble(valor);
			final double pesoC = 2.45;
			double valorconvertido = valorreal/pesoC;
			msg= "O valor convertido em dolar é de:"+valorconvertido;
			JOptionPane.showMessageDialog(null, msg);
		} 
	
	


}
}

