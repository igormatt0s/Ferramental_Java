//Nome: Igor Araujo de Mattos - RA: 2346443

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Matriz{
	public static void main(String arg[]){

		int lin = 3, col = 3;
		int mtrz1[][] = new int[3][3];
		int mtrz2[][] = new int[3][3];

		for(int i = 0; i < 3; i++){
			for(int c = 0; c < 3; c++){
				System.out.println("\nInforme o valor inteiro: ");

				InputStreamReader teclado = new InputStreamReader(System.in);
				BufferedReader buff = new BufferedReader(teclado);

				String a = "";

				try{
					a = buff.readLine();
				}
				catch(IOException ioe){
					System.out.println("\nERRO de sistema: RAM - TECLADO");
				}
			
				int num = Integer.parseInt(a);
			
				mtrz1[i][c] = num;
			}
		}

		for(int i = 0, j = 2; i < 3; i++, j--){
			for(int c = 0, k = 2; c < 3; c++, k--){
				mtrz2[j][k] = mtrz1[i][c];
			}
		}

		System.out.println("\n");
		
		for(int i = 0; i < 3; i++){
			for(int c = 0; c < 3; c++){
				System.out.println("matriz["+i+"]["+c+"] = "+mtrz2[i][c]);
			}
		}
	}
}