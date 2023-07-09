package temperatura;

public class ConversorCelsius {
	
	
	protected double temperatura;
	
	public ConversorCelsius(double temperatura) {
		
		this.temperatura = temperatura;
		
	}
	
	public void setCelsiusFahrenheit(double temperatura) {
		
		this.temperatura = temperatura;
	}
	
	public void setCelsiusKelvin(double temperatura) {
		
		this.temperatura = temperatura;
	}
	
	public double getCelsiusFahrenheit() {
		
		double f = (this.temperatura * 1.8) + 32;
		
		return f;
	}
	
	public double getCelsiusKelvin() {
		
		double k = this.temperatura + 273.15;
		return k;
	}
	
	

}
