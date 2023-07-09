package desafioConversor;

import javax.swing.JOptionPane;

public class VentanaOpcion {
	
	protected boolean continuar;
	
	public VentanaOpcion(boolean continuar) {
		this.continuar = continuar;
	}
	
	public void setDecision() {
		Object[] options = {"Si","No","Cancelar"};
		
		int n = JOptionPane.showOptionDialog(null,"Desea continuar","Selecciona una opcion",
				JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);

		if( n == 0) this.continuar = true;
		if( n == 1) this.continuar = false;
		if( n == 2) this.continuar = false;
	}
	
	public boolean getDecision() {
		return this.continuar;
	}

	
	
	
}
