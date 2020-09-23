import javax.swing.JOptionPane;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int resutado=1;
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("ingresa un numero"));
	
		
		
		for (int i = numero; i >0  ; i--) {
			
		
			resutado=resutado*i;
			
			System.out.println("el factorial de numero " + i + " es :" + resutado);
		}
		
	//JOptionPane.showMessageDialog("el factorial de numero es :" + resutado);
		
		System.out.println("el factorial de numero " + numero + " es :" + resutado);
	}

}
