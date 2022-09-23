//Nome: Igor Araujo de Mattos - RA: 2346443

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Selec2{
	public static void main(String arg[]){

		System.out.println("\nInforme um valor inteiro: ");

		InputStreamReader teclado1 = new InputStreamReader(System.in);
		BufferedReader buff1 = new BufferedReader(teclado1);

		String a = "";

		try{
			a = buff1.readLine();
		}
		catch(IOException ioe){
			System.out.println("\nERRO de sistema: RAM - TECLADO");
		}
		
		int num = Integer.parseInt(a);

		if((num % 2) == 0){
			System.out.println("\nO numero "+num+" eh par!");
		}
		else if((num % 2) != 0){
			System.out.println("\nO numero "+num+" eh impar!");
		}
		
	}
} 
