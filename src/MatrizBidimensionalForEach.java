
public class MatrizBidimensionalForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matriz = {
				
				{10,15,28,39,24},
				{40,56,84,58,98},
				{76,12,16,30,78},
				{22,97,87,32,65}
				
		};
		
		for (int[] fila : matriz) {
			
			System.out.println("");
			
			for (int columna :fila) {
				
				System.out.print(columna + "    ");
				
			}
			
		}
		
	}

}
