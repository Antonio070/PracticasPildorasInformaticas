import javax.swing.*;
public class PrimeraClase {

	public static void main(String[] args) {
	
		String clave="Cecilia"; 

		String pass ="";
		
		
		while (clave.equals(pass) == false){
		
			pass = JOptionPane.showInputDialog("Introduce password");
			
			if (clave.equals(pass)==false) {
				JOptionPane.showMessageDialog(null, "error");
			}//cierre if
				
			
		}//cierre while
		
		JOptionPane.showMessageDialog(null, "Bienvenida mi amor CECILIA");
		
	}//cierre main

}//cierre class
