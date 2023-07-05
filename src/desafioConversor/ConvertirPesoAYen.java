package desafioConversor;

public class ConvertirPesoAYen extends Valor {

	public ConvertirPesoAYen( double valorIngresado) {		
		super(valorIngresado);		
	}

	public double getConvertirPesoADivisas() {		
		return super.getValorIngresado() * super.getYen();
	}
	
	public double getConvertirDivisaAPeso() {
		return super.getYen() / super.getValorIngresado();
	}
}
