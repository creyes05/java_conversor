package temperatura;

import javax.swing.JOptionPane;

public class VentanaMostrarTemperatura {

	protected double temperatura;
	
	public VentanaMostrarTemperatura( double temperatura) {
		this.temperatura = temperatura;
	}
	
	
	public void MostrarCF() {
		ConversorCelsius conversorC = new ConversorCelsius(temperatura);
		conversorC.setCelsiusFahrenheit(temperatura);
		
		JOptionPane.showMessageDialog(null, this.temperatura +" °C es igual a: " + conversorC.getCelsiusFahrenheit() + " °F");
	}
	
	public void MostrarCK() {
		ConversorCelsius conversorC = new ConversorCelsius(temperatura);
		conversorC.setCelsiusKelvin(temperatura);
		
		JOptionPane.showMessageDialog(null, this.temperatura +" °C es igual a: " + conversorC.getCelsiusKelvin() + " °K");
	}
	
	public void MostrarFC() {
		ConversorFahrenheit conversorF = new ConversorFahrenheit(temperatura);
		conversorF.setFahrenheitCelsius(temperatura);
		
		JOptionPane.showMessageDialog(null, this.temperatura +" °F es igual a: " + conversorF.getFahrenheitCelsius() + " °C");
	}
	
	public void MostrarFK() {
		ConversorFahrenheit conversorF = new ConversorFahrenheit(temperatura);
		conversorF.setFahrenheitKelvin(temperatura);
		
		JOptionPane.showMessageDialog(null, this.temperatura +" °F es igual a: " + conversorF.getFahrenheitKelvin() + " °K");
	}
	
	public void MostrarKC() {
		ConversorKelvin conversorK = new ConversorKelvin(temperatura);
		conversorK.setKelvinCelsius(temperatura);
		
		JOptionPane.showMessageDialog(null, this.temperatura +" °K es igual a: " + conversorK.getKelvinCelsius() + " °C");
	}
	
	public void MostrarKF() {
		ConversorKelvin conversorK = new ConversorKelvin(temperatura);
		conversorK.setKelvinFahrenheit(temperatura);
		
		JOptionPane.showMessageDialog(null, this.temperatura +" °K es igual a: " + conversorK.getKelvinFahrenheit() + " °F");
	}
}
