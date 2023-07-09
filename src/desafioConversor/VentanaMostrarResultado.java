package desafioConversor;

import javax.swing.JOptionPane;

public class VentanaMostrarResultado {

	private double cantidad;
	
	public VentanaMostrarResultado( double cantidad) {
		
		this.cantidad = cantidad;
		
	}
	
	public void MostrarPesoDolar() {
		ConvertirPesoADolar pesoADolar = new ConvertirPesoADolar(cantidad);
		pesoADolar.setValorIngresado(cantidad);
		JOptionPane.showMessageDialog(null,"Valor del dolar: " + pesoADolar.getDolar() + " dolar"+ "\n" + 
				cantidad + " peso es igual a: " + pesoADolar.getConvertirPesoADivisas() + " dolar.");
	}
	
	public void MostrarPesoEuro() {
		ConvertirPesoAEuro pesoAEuro = new ConvertirPesoAEuro(cantidad);
		pesoAEuro.setValorIngresado(cantidad);
		JOptionPane.showMessageDialog(null,"Valor del euro: " + pesoAEuro.getEuro() + " euro"+ "\n" +
				cantidad + " pesos es igual a: " + pesoAEuro.getConvertirPesoADivisas() + " Euro.");

	}
	
	public void MostrarPesoLibras() {
		ConvertirPesoALibra pesoLibra = new ConvertirPesoALibra(cantidad);
		pesoLibra.setValorIngresado(cantidad);
		JOptionPane.showMessageDialog(null,"Valor de la libra: " + pesoLibra.getLibra() + " libra"+ "\n" +
				cantidad + " pesos es igual a: " + pesoLibra.getConvertirPesoADivisas() + " libra.");

	}
	
	public void MostrarPesoYen(){
		ConvertirPesoAYen pesoYen = new ConvertirPesoAYen(cantidad);
		pesoYen.setValorIngresado(cantidad);
		JOptionPane.showMessageDialog(null,"Valor de la Yen: " + pesoYen.getYen() + " yen" + "\n" +
				cantidad + " pesos es igual a: " + pesoYen.getConvertirPesoADivisas() + " yen.");
	}
	
	public void MostrarPesoWon() {
		ConvertirPesoAWon pesoWon = new ConvertirPesoAWon(cantidad);
		pesoWon.setValorIngresado(cantidad);
		JOptionPane.showMessageDialog(null,"Valor del Won Coreano: " + pesoWon.getWon() + " won coreano" + "\n" +
				cantidad + " pesos es igual a: " + pesoWon.getConvertirPesoADivisas() + " won coreano.");
	}
	
	public void MostrarDolarPeso() {
		ConvertirPesoADolar dolarAPeso = new ConvertirPesoADolar(cantidad);
		dolarAPeso.setValorIngresado(cantidad);
		JOptionPane.showMessageDialog(null, "Valor del dolar: " + dolarAPeso.getDolar() + " dolar"+ "\n" +
				cantidad + " dolar es igual a: " + dolarAPeso.getConvertirDivisaAPeso() + " peso.");

	}
	
	public void MostrarEuroPeso() {
		ConvertirPesoAEuro euroAPeso = new ConvertirPesoAEuro(cantidad);
		euroAPeso.setValorIngresado(cantidad);
		JOptionPane.showMessageDialog(null, "Valor del euro: " + euroAPeso.getEuro() + " euro"+ "\n" +
				cantidad + " euro es igual a: " + euroAPeso.getConvertirDivisaAPeso() + " peso.");
	}
	
	public void MostrarLibraPeso() {
		ConvertirPesoALibra libraAPeso = new ConvertirPesoALibra(cantidad);
		libraAPeso.setValorIngresado(cantidad);
		JOptionPane.showMessageDialog(null, "Valor de la libra: " + libraAPeso.getLibra() + " libra"+ "\n" +
				cantidad + " libra es igual a: " + libraAPeso.getConvertirDivisaAPeso() + " peso.");

	}
}
