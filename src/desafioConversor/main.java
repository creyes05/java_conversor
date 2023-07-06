package desafioConversor;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		
		boolean continuar;
		
		do {
			
			continuar = true;
						
			Object[] opcion = { "Selecciona", "Conversor de moneda", "Conversor de temperatura" };

			String opc = (String) JOptionPane.showInputDialog(null,
					"Seleccione una opción de conversión" + "\n" + "1.- Conversor de moneda" + "\n"
							+ "2.- Conversor de temperatura",
					"Menú", JOptionPane.PLAIN_MESSAGE, null, opcion, "Selecciona");

			if (opc == "Conversor de moneda") {
				String caracter = JOptionPane.showInputDialog(null, "Ingresa la cantidad de dinero que deseas convertir");
				boolean esNumero = caracter.matches("[+-]?\\d*(\\.\\d+)?");

				if (esNumero) {

					double cantidad = Double.parseDouble(caracter);

					Object[] monedas = { "Selecciona", "De Peso a Dolar", "De Peso a Euro", "De Peso a Libras",
							"De Peso a Yen", "De Peso a Won Coreano", "De Dolar a Peso", "De Euro a Peso",
							"De Libras a Peso" };

					String opc2 = (String) JOptionPane.showInputDialog(null,
							"Elige la moneda a la que deseas convertir tu dinero", "Monedas", JOptionPane.PLAIN_MESSAGE,
							null, monedas, "Selecciona");

					if (opc2 == "De Peso a Dolar") {
						ConvertirPesoADolar pesoADolar = new ConvertirPesoADolar(cantidad);
						pesoADolar.setValorIngresado(cantidad);
						JOptionPane.showMessageDialog(null,"Valor del dolar: " + pesoADolar.getDolar() + " dolar"+ "\n" + 
								cantidad + " peso es igual a: " + pesoADolar.getConvertirPesoADivisas() + " dolar.");
						
						
						Object[] options = {"Si","No","Cancelar"};
						
						int n = JOptionPane.showOptionDialog(null,"Desea continuar","Selecciona una opcion",
								JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);

						if( n == 0) continuar = true;
						if( n == 1) continuar = false;
						if( n == 2) continuar = false;
						
					}

					if (opc2 == "De Peso a Euro") {
						ConvertirPesoAEuro pesoAEuro = new ConvertirPesoAEuro(cantidad);
						pesoAEuro.setValorIngresado(cantidad);
						JOptionPane.showMessageDialog(null,"Valor del euro: " + pesoAEuro.getEuro() + " euro"+ "\n" +
								cantidad + " pesos es igual a: " + pesoAEuro.getConvertirPesoADivisas() + " Euro.");

						Object[] options = {"Si","No","Cancelar"};
						
						int n = JOptionPane.showOptionDialog(null,"Desea continuar","Selecciona una opcion",
								JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);

						if( n == 0) continuar = true;
						if( n == 1) continuar = false;
						if( n == 2) continuar = false;
						
					}

					if (opc2 == "De Peso a Libras") {
						ConvertirPesoALibra pesoLibra = new ConvertirPesoALibra(cantidad);
						pesoLibra.setValorIngresado(cantidad);
						JOptionPane.showMessageDialog(null,"Valor de la libra: " + pesoLibra.getLibra() + " libra"+ "\n" +
								cantidad + " pesos es igual a: " + pesoLibra.getConvertirPesoADivisas() + " libra.");

						Object[] options = {"Si","No","Cancelar"};
						
						int n = JOptionPane.showOptionDialog(null,"Desea continuar","Selecciona una opcion",
								JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);

						if( n == 0) continuar = true;
						if( n == 1) continuar = false;
						if( n == 2) continuar = false;
					}

					if (opc2 == "De Peso a Yen") {
						ConvertirPesoAYen pesoYen = new ConvertirPesoAYen(cantidad);
						pesoYen.setValorIngresado(cantidad);
						JOptionPane.showMessageDialog(null,"Valor de la Yen: " + pesoYen.getYen() + " yen" + "\n" +
								cantidad + " pesos es igual a: " + pesoYen.getConvertirPesoADivisas() + " yen.");

						Object[] options = {"Si","No","Cancelar"};
						
						int n = JOptionPane.showOptionDialog(null,"Desea continuar","Selecciona una opcion",
								JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);

						if( n == 0) continuar = true;
						if( n == 1) continuar = false;
						if( n == 2) continuar = false;
					}

					if (opc2 == "De Peso a Won Coreano") {
						ConvertirPesoAWon pesoWon = new ConvertirPesoAWon(cantidad);
						pesoWon.setValorIngresado(cantidad);
						JOptionPane.showMessageDialog(null,"Valor del Won Coreano: " + pesoWon.getWon() + " won coreano" + "\n" +
								cantidad + " pesos es igual a: " + pesoWon.getConvertirPesoADivisas() + " won coreano.");

						Object[] options = {"Si","No","Cancelar"};
						
						int n = JOptionPane.showOptionDialog(null,"Desea continuar","Selecciona una opcion",
								JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);

						if( n == 0) continuar = true;
						if( n == 1) continuar = false;
						if( n == 2) continuar = false;
						
					}

					if (opc2 == "De Dolar a Peso") {
						ConvertirPesoADolar dolarAPeso = new ConvertirPesoADolar(cantidad);
						dolarAPeso.setValorIngresado(cantidad);
						JOptionPane.showMessageDialog(null, "Valor del dolar: " + dolarAPeso.getDolar() + " dolar"+ "\n" +
								cantidad + " dolar es igual a: " + dolarAPeso.getConvertirDivisaAPeso() + " peso.");


						Object[] options = {"Si","No","Cancelar"};
						
						int n = JOptionPane.showOptionDialog(null,"Desea continuar","Selecciona una opcion",
								JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);

						if( n == 0) continuar = true;
						if( n == 1) continuar = false;
						if( n == 2) continuar = false;
						
					}

					if (opc2 == "De Euro a Peso") {
						ConvertirPesoAEuro euroAPeso = new ConvertirPesoAEuro(cantidad);
						euroAPeso.setValorIngresado(cantidad);
						JOptionPane.showMessageDialog(null, "Valor del euro: " + euroAPeso.getEuro() + " euro"+ "\n" +
								cantidad + " euro es igual a: " + euroAPeso.getConvertirDivisaAPeso() + "peso.");


						Object[] options = {"Si","No","Cancelar"};
						
						int n = JOptionPane.showOptionDialog(null,"Desea continuar","Selecciona una opcion",
								JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);

						if( n == 0) continuar = true;
						if( n == 1) continuar = false;
						if( n == 2) continuar = false;
					}

					if (opc2 == "De Libras a Peso") {
						ConvertirPesoALibra libraAPeso = new ConvertirPesoALibra(cantidad);
						libraAPeso.setValorIngresado(cantidad);
						JOptionPane.showMessageDialog(null, "Valor de la libra: " + libraAPeso.getLibra() + " libra"+ "\n" +
								cantidad + " libra es igual a: " + libraAPeso.getConvertirDivisaAPeso() + "peso.");


						Object[] options = {"Si","No","Cancelar"};
						
						int n = JOptionPane.showOptionDialog(null,"Desea continuar","Selecciona una opcion",
								JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);

						if( n == 0) continuar = true;
						if( n == 1) continuar = false;
						if( n == 2) continuar = false;
					}

				} else {
					JOptionPane.showMessageDialog(null, "Solo se permiten numeros");
					continuar = true;
				}

			}
			if (opc == "Conversor de temperatura") {
				JOptionPane.showInputDialog(null, "Ingresa la temperatura a convertir");
			}

			
		} while (continuar == true);
		JOptionPane.showMessageDialog(null, "Programa finalizado");
		
	}

}
