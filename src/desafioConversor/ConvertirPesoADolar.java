package desafioConversor;

public class ConvertirPesoADolar extends Valor  {
	
	public ConvertirPesoADolar( double valorIngresado) {		
		super(valorIngresado);		
	}

	public double getConvertirPesoADivisas() {	
		double conversion = super.getValorIngresado() / super.getDolar();
		double resultado = Math.round(conversion * 1000) / 1000d;
		return resultado; 
	}
	
	public double getConvertirDivisaAPeso() {
		return super.getValorIngresado() * super.getDolar();
	}

}
