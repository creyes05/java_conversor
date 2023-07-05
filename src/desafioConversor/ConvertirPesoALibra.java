package desafioConversor;

public class ConvertirPesoALibra extends Valor{

	public ConvertirPesoALibra( double valorIngresado) {		
		super(valorIngresado);		
	}

	public double getConvertirPesoADivisas() {		
		double conversion = super.getValorIngresado() / super.getLibra();
		double resultado = Math.round(conversion * 1000) / 1000d;
		return resultado;
	}
	
	public double getConvertirDivisaAPeso() {
		return super.getValorIngresado() * super.getLibra();
	}
}
