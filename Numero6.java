import java.util.Scanner;

public class Numero6 {
	public static void main(String[] args) {
		
		//Declaración de la matriz
		int [][] matriz = new int [3][3];
		
		Scanner leer = new Scanner(System.in);
		
		//Llenar la matriz
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				matriz [i][j]= leer.nextInt();
			}
				System.out.print( " "+"\n");
		}
		
		//Ordenación de la matriz
		for( int i=0; i < 3; i++){
			for( int j=0;j< 3; j++){
				for(int x=0; x < 3; x++){
					for(int y=0; y <3; y++){
						if(matriz[i][j] < matriz[x][y]){
							int t = matriz[i][j];
							matriz[i][j] = matriz[x][y];
							matriz[x][y] = t;
						}
					}
				}
			} 
		}
		
		//Imprimimos la matriz		
		System.out.print( "—————————–"+"\n");
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				System.out.print(matriz [i][j]+" ");
			}
				System.out.print( " "+"\n");
		}
	}
}