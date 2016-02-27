import java.util.Scanner;

public class Laboratorio1 {
	
	public void mas_votado(int resultados[][], int num_municipios) {
		int max = 0;
		for (int i = 0; i < (num_municipios + 1); i++) {
			max = 0;
			int temp =0;
			for (int j = 0; j < 4; j++) {
				if (max < resultados[i][j]) {
					max = resultados[i][j];
					temp=j;
				}

			}
			if (max > 1) {
				System.out.println("Mayor de votos del municipio "+(i+1)+" ,candidato "+(temp+1)+" : " + max);
			}
		}

	}

	public void number_to_string(int resultado[][], String tabla[][], int num) {
		for (int i = 1; i < (num + 1); i++) {
			tabla[i][0] = ("Municipio" + (i));
			for (int j = 0; j < 4; j++) {
				tabla[i][j + 1] = Integer.toString(resultado[i - 1][j]);

			}

		}

	}

	public void asig_votacion(int resultado[][], int num) {
		Scanner S = new Scanner(System.in);
		for (int i = 0; i < num; i++) {
			System.out.println("Municipio " + (i + 1));
			for (int j = 0; j < 4; j++) {
				System.out.println("Ingrese cantidad de votos candidato " + (j + 1));
				resultado[i][j] = S.nextInt();
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tabla[][] = new String[21][5];
		int resultados[][] = new int[20][4];
		int num_municipios;
		tabla[0][0] = "          ";
		tabla[0][1] = "Can A";
		tabla[0][2] = "Can B";
		tabla[0][3] = "Can C";
		tabla[0][4] = "Can D";
		System.out.println("Ingrese el numero de municipios de los cuales desea calcular votacion");
		Scanner A = new Scanner(System.in);
		num_municipios = A.nextInt();

		Laboratorio1 tab = new Laboratorio1();
		tab.asig_votacion(resultados, num_municipios);
		tab.number_to_string(resultados, tabla, num_municipios);

		for (int i = 0; i < (num_municipios + 1); i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(tabla[i][j] + "\t");

			}
			System.out.println();
		}
		tab.mas_votado(resultados, num_municipios);
		
	}

}
