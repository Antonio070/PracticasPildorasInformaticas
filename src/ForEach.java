import javax.swing.*;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] paises = new String [8];
		
		//String [] paises = {"Mexico","USA","Colombia","Venezuela","España","Suecia","Portugal","Brazil"};
		
		/*for (int i = 0; i < paises.length; i++) {
			
			System.out.println("pais " +(i+1) +"  "+ paises[i] );
		}
		*/
		
		for (int i = 0; i < paises.length; i++) {
			
			paises[i]=JOptionPane.showInputDialog("Introduce pais " + (i+1));
		}
		
		for (String elementos : paises) {
			
			
			System.out.println("pais :" + elementos );
		}
		
	}

}
