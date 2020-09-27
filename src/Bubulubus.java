

import javax.swing.JOptionPane;

public class Bubulubus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int bubulubus =0;


int cantidad = Integer.parseInt((JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas obtener vendiendo la oferta de 3 bubulubus X 10 pesitos ")));

	bubulubus = cantidad /10;
	
	JOptionPane.showMessageDialog(null, "la cantidad de ofertas de bubulubus que tienes que vender es de : " + bubulubus);

	}

}
