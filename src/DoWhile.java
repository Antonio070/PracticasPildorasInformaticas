import javax.swing.*;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String genero="";
		
		do {
			genero=JOptionPane.showInputDialog("introduce tu genero (H/M)");
			
		} while (genero.equalsIgnoreCase("H")== false && genero.equalsIgnoreCase("M")== false  );
		
		int alt=Integer.parseInt(JOptionPane.showInputDialog("introduce la altura en CM"));
		
		int pesoIdeal=0;
		
		if (genero.equalsIgnoreCase("H")) {
			
			pesoIdeal=alt-110;
			
		}else if (genero.equalsIgnoreCase("M")) {

			pesoIdeal=alt-120;
			
		}else {

			System.out.println("selecciona una opcio valida");
			
		}
			
			System.out.println("Tu peso ideal es : " + pesoIdeal);
		
	}

}
 