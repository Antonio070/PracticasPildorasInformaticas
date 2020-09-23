import javax.swing.JOptionPane;

public class CompruebaMail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		 int arroba= 0;
		 
		 boolean punto = false;
		 
		 String mail= JOptionPane.showInputDialog("introduce el e mail") ;
			 
		 for (int i = 0; i < mail.length(); i++) {
			 
			 // que no se repita un arroba
						 
			 if (mail.charAt(i)=='@' ) {
				
				 arroba++;
			
			}
			 if ( mail.charAt(i)=='.') {

				 punto=true;
			 }
		}
	
		 if (arroba==1 && punto==true) {
			 
			System.out.println("mail correcto");
			
		}else {
			
			System.out.println("mail incorrecto");
			
		}
		
	  }

	
}
