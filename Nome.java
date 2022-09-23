//Nome: Igor Araujo de Mattos - RA: 2346443

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Nome{
	public static void main(String arg[]){

		System.out.println("Meu nome eh: ");

		InputStreamReader teclado = new InputStreamReader(System.in);
		BufferedReader buff = new BufferedReader(teclado);

		String resp = "";

		try{
			resp = buff.readLine();
		}
		catch(IOException ioe){
			System.out.println("\nERRO de sistema: RAM - TECLADO");
		}

		System.out.println("Meu nome eh: "+resp);
	}
}