package temperatura;

public class ConversorKelvin {
	
	protected double temperatura;
	
	public ConversorKelvin(double temperatura){
		
		this.temperatura = temperatura;
	}
	
	public void setKelvinCelsius(double temperatura) {
		
		this.temperatura = temperatura;
	}
	
	public void setKelvinFahrenheit(double temperatura) {
		
		this.temperatura = temperatura;
	}
	
	public double getKelvinCelsius() {
		
		double c = this.temperatura - 273.15;
		
		return c;
	}
	
	public double getKelvinFahrenheit() {
		
		double k = 1.8 *  (this.temperatura  - 273) + 32;  
		double resultado = Math.round(k * 1000) / 1000d;
		return resultado;
	}

}
