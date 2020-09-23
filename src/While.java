import java.util.*;


public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int aleatorio =(int)(Math.random()*100);
		//System.out.println(aleatorio);
		
		Scanner Scan = new Scanner(System.in);
		
		int num =0;
		
		int inten=0;
		
		do {
			
			System.out.println("introduce un numero");
			num=Scan.nextInt();
						
			//si aleatorio es menor que numero
			
			if (aleatorio<num) {
				
				System.out.println("mas bajo");
				// si aleatorio es mayor que numero
			}else if (aleatorio>num) {
				
				System.out.println("mas alto");
				
			}
			//acumulador
			inten+=1;
		} //mientras numero diferente de aleatorio
		while (num != aleatorio) ;
		
		System.out.println("Correcto");
		System.out.println("El numero de intentos fue:  " + inten);
		
	}

}
