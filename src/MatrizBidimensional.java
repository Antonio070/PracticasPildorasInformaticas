
public class MatrizBidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] arreglobidi = new int [4][5];
		
		arreglobidi[0][0]=1;
		arreglobidi[0][1]=11;
		arreglobidi[0][2]=111;
		arreglobidi[0][3]=1111;
		arreglobidi[0][4]=11111;
		
		arreglobidi[1][0]=2;
		arreglobidi[1][1]=22;
		arreglobidi[1][2]=222;
		arreglobidi[1][3]=2222;
		arreglobidi[1][4]=22222;
		
		arreglobidi[2][0]=3;
		arreglobidi[2][1]=33;
		arreglobidi[2][2]=333;
		arreglobidi[2][3]=3333;
		arreglobidi[2][4]=33333;
		
		arreglobidi[3][0]=4;
		arreglobidi[3][1]=44;
		arreglobidi[3][2]=444;
		arreglobidi[3][3]=4444;
		arreglobidi[3][4]=44444;
		
		
		//priemera dimension
		for (int i = 0; i < 4; i++) {
			//agregar salto de linea
			System.out.println();
			
			//segunda dimension
			for (int j = 0; j < 5; j++) {
				//agregamos datos a la matriz 
				System.out.print(arreglobidi[i][j]+"  ");
			}
				
		}
	}

}
