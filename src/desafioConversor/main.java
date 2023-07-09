package desafioConversor;

import javax.swing.JOptionPane;
import temperatura.VentanaMostrarTemperatura;

public class main {

	public static void main(String[] args) {
		
		boolean continuar;
		
		do {
			
			continuar = true;
						
			Object[] opcion = { "Selecciona", "Conversor de moneda", "Conversor de temperatura" };

			String opc = (String) JOptionPane.showInputDialog(null,
					"Seleccione una opción de conversión" + "\n" 
							+ "1.- Conversor de moneda" + "\n"
							+ "2.- Conversor de temperatura" + "\n",
			
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
							
						VentanaMostrarResultado ventana = new VentanaMostrarResultado(cantidad);
						ventana.MostrarPesoDolar();
						
						VentanaOpcion menuSeleccion = new VentanaOpcion(continuar);
						menuSeleccion.setDecision();
						continuar = menuSeleccion.getDecision();
												
					}

					if (opc2 == "De Peso a Euro") {
						
						VentanaMostrarResultado ventana = new VentanaMostrarResultado(cantidad);
						ventana.MostrarPesoEuro();
						
						VentanaOpcion menuSeleccion = new VentanaOpcion(continuar);
						menuSeleccion.setDecision();
						continuar = menuSeleccion.getDecision();
						
					}

					if (opc2 == "De Peso a Libras") {
						
						VentanaMostrarResultado ventana = new VentanaMostrarResultado(cantidad);
						ventana.MostrarPesoLibras();
						
						VentanaOpcion menuSeleccion = new VentanaOpcion(continuar);
						menuSeleccion.setDecision();
						continuar = menuSeleccion.getDecision();
					}

					if (opc2 == "De Peso a Yen") {
						
						VentanaMostrarResultado ventana = new VentanaMostrarResultado(cantidad);
						ventana.MostrarPesoYen();

						VentanaOpcion menuSeleccion = new VentanaOpcion(continuar);
						menuSeleccion.setDecision();
						continuar = menuSeleccion.getDecision();
					}

					if (opc2 == "De Peso a Won Coreano") {
						
						VentanaMostrarResultado ventana = new VentanaMostrarResultado(cantidad);
						ventana.MostrarPesoWon();
						
						VentanaOpcion menuSeleccion = new VentanaOpcion(continuar);
						menuSeleccion.setDecision();
						continuar = menuSeleccion.getDecision();
						
					}

					if (opc2 == "De Dolar a Peso") {
						VentanaMostrarResultado ventana = new VentanaMostrarResultado(cantidad);
						ventana.MostrarDolarPeso();

						VentanaOpcion menuSeleccion = new VentanaOpcion(continuar);
						menuSeleccion.setDecision();
						continuar = menuSeleccion.getDecision();
						
					}

					if (opc2 == "De Euro a Peso") {
						
						VentanaMostrarResultado ventana = new VentanaMostrarResultado(cantidad);
						ventana.MostrarEuroPeso();
						
						VentanaOpcion menuSeleccion = new VentanaOpcion(continuar);
						menuSeleccion.setDecision();
						continuar = menuSeleccion.getDecision();
					}

					if (opc2 == "De Libras a Peso") {
						
						VentanaMostrarResultado ventana = new VentanaMostrarResultado(cantidad);
						ventana.MostrarLibraPeso();
						
						VentanaOpcion menuSeleccion = new VentanaOpcion(continuar);
						menuSeleccion.setDecision();
						continuar = menuSeleccion.getDecision();
						
					}

				} else {
					JOptionPane.showMessageDialog(null, "Solo se permiten numeros");
					continuar = true;
				}

			}
			if (opc == "Conversor de temperatura") {
				String caracter = JOptionPane.showInputDialog(null, "Ingresa la temperatura a convertir");
				boolean esNumero = caracter.matches("[+-]?\\d*(\\.\\d+)?");

				if (esNumero) {

					double temperatura = Double.parseDouble(caracter);

					Object[] monedas = { "Selecciona", "De Celsius a Fahrenheit", "De Celsius a kelvin", "De Fahrenheit a Celsius",
							"De Fahrenheit a kelvin", "De kelvin a Celsius", "De kelvin a Fahrenheit" };

					String opc3 = (String) JOptionPane.showInputDialog(null,
							"Elige la moneda a la que deseas convertir tu dinero", "Monedas", JOptionPane.PLAIN_MESSAGE,
							null, monedas, "Selecciona");

					
					if (opc3 == "De Celsius a Fahrenheit") {
							
						VentanaMostrarTemperatura vmr = new VentanaMostrarTemperatura(temperatura);
						vmr.MostrarCF();
						
						VentanaOpcion menuSeleccion = new VentanaOpcion(continuar);
						menuSeleccion.setDecision();
						continuar = menuSeleccion.getDecision();

					}
					
					if (opc3 == "De Celsius a kelvin") {
						
						VentanaMostrarTemperatura vmr = new VentanaMostrarTemperatura(temperatura);
						vmr.MostrarCK();
						
						VentanaOpcion menuSeleccion = new VentanaOpcion(continuar);
						menuSeleccion.setDecision();
						continuar = menuSeleccion.getDecision();

					}
					
					if (opc3 == "De Fahrenheit a Celsius") {
						
						VentanaMostrarTemperatura vmr = new VentanaMostrarTemperatura(temperatura);
						vmr.MostrarFC();
						
						VentanaOpcion menuSeleccion = new VentanaOpcion(continuar);
						menuSeleccion.setDecision();
						continuar = menuSeleccion.getDecision();

					}
					
					if (opc3 == "De Fahrenheit a kelvin") {
						
						VentanaMostrarTemperatura vmr = new VentanaMostrarTemperatura(temperatura);
						vmr.MostrarFK();
						
						VentanaOpcion menuSeleccion = new VentanaOpcion(continuar);
						menuSeleccion.setDecision();
						continuar = menuSeleccion.getDecision();

					}
					
					if (opc3 == "De kelvin a Celsius") {
						
						VentanaMostrarTemperatura vmr = new VentanaMostrarTemperatura(temperatura);
						vmr.MostrarKC();
						
						VentanaOpcion menuSeleccion = new VentanaOpcion(continuar);
						menuSeleccion.setDecision();
						continuar = menuSeleccion.getDecision();

					}
					

					if (opc3 == "De kelvin a Fahrenheit") {
						
						VentanaMostrarTemperatura vmr = new VentanaMostrarTemperatura(temperatura);
						vmr.MostrarKF();
						
						VentanaOpcion menuSeleccion = new VentanaOpcion(continuar);
						menuSeleccion.setDecision();
						continuar = menuSeleccion.getDecision();

					}


				}else {
					JOptionPane.showMessageDialog(null, "Solo se permiten numeros");
					continuar = true;
				}
			
		}
			
		} while (continuar == true);
		JOptionPane.showMessageDialog(null, "Programa finalizado");
		
	}

}
