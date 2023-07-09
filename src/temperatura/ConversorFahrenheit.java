package temperatura;

public class ConversorFahrenheit {
	
	
	protected double temperatura;
	
	public ConversorFahrenheit(double temperatura) {
		
		this.temperatura = temperatura;
		
	}
	
	public void setFahrenheitCelsius(double temperatura) {
		
		this.temperatura = temperatura;
	}
	
	public void setFahrenheitKelvin(double temperatura) {
		
		this.temperatura = temperatura;
	}
	
	public double getFahrenheitCelsius() {
		
		double c = (this.temperatura - 32 ) / 1.8;
		
		return c;
	}
	
	public double getFahrenheitKelvin() {
		
		double k = (this.temperatura  - 32) * 5/9 + 273.15;  
		double resultado = Math.round(k * 1000) / 1000d;
		return resultado;
	}
	
	

}
