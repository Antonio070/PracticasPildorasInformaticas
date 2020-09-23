
public class ForEachDos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] numeros_Aleatorios = new int[15];
		
		for (int i = 0; i < numeros_Aleatorios.length; i++) {
			
			numeros_Aleatorios[i]=(int)Math.round(Math.random()*100);
			
		}
		
		for (int i : numeros_Aleatorios) {
			
			System.out.print(i+"   ");
		}
		
	}

}
