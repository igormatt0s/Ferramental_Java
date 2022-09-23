//Nome: Igor Araujo de Mattos - RA: 2346443

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Vetor{
	public static void main(String arg[]){

		int larg = 5;
		int vtr1[] = new int[larg];
		int vtr2[] = new int[larg];

		for(int i = 0; i < larg; i++){
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
			
			vtr1[i] = num;
		}

		for(int i = 0, j = 4; i < 5; i++, j--){
			vtr2[j] = vtr1[i];
		}

		System.out.println("\n");
		
		for(int i = 0; i < 5; i++){
			System.out.println(" "+vtr2[i]);
		}
	}
} 
