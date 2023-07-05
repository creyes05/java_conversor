package desafioConversor;

public class ConvertirPesoAEuro extends Valor {

	public ConvertirPesoAEuro( double valorIngresado) {		
		super(valorIngresado);		
	}

	public double getConvertirPesoADivisas() {		
		double conversion = super.getValorIngresado() / super.getEuro();
		double resultado = Math.round(conversion * 1000) / 1000d;
		return resultado;
	}
	
	public double getConvertirDivisaAPeso() {
		return  super.getValorIngresado() * super.getEuro();
	}
}
