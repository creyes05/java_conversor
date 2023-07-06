package desafioConversor;

import javax.swing.JOptionPane;

public class ClasePrueba {

	public static void main(String[] args) {
		
		
		
		boolean continuar;
		do {
			
			continuar = true;
			
			Object[] options = {"Si",
	                "No",
	                "Cancelar"};
			
			int n = JOptionPane.showOptionDialog(null,
					"Desea continuar",
					"Selecciona una opcion",
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null,options,options[0]);

					
			if( n == 0) {
				
				continuar = true;
			}
			if( n == 1) {
				
				continuar = false;
			}
			if( n == 2) {
				
				continuar = false;
			}
			
			
			
		} while (continuar == true);
		JOptionPane.showMessageDialog(null, "Programa finalizado");
		
	}

}
