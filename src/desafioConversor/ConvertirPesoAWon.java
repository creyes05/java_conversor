package desafioConversor;

public class ConvertirPesoAWon extends Valor{

	public ConvertirPesoAWon( double valorIngresado) {		
		super(valorIngresado);		
	}

	public double getConvertirPesoADivisas() {		
		double conversion = super.getValorIngresado() / super.getWon();
		double resultado = Math.round(conversion * 100) / 100d;
		return resultado;
	}
	
	public double getConvertirDivisaAPeso() {
		return super.getWon() * super.getValorIngresado();
	}
}
