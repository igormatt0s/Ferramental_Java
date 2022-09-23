//Nome: Igor Araujo de Mattos - RA: 2346443

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Strings{
	public static void main(String arg[]){

		System.out.println("\nEscreva uma frase: ");

		InputStreamReader teclado1 = new InputStreamReader(System.in);
		BufferedReader buff1 = new BufferedReader(teclado1);

		String a = "";

		try{
			a = buff1.readLine();
		}
		catch(IOException ioe){
			System.out.println("\nERRO de sistema: RAM - TECLADO");
		}
		
		System.out.println("\nEscolha uma letra: ");

		InputStreamReader teclado2 = new InputStreamReader(System.in);
		BufferedReader buff2 = new BufferedReader(teclado2);

		String letra = "";

		try{
			letra = buff2.readLine();
		}
		catch(IOException ioe){
			System.out.println("\nERRO de sistema: RAM - TECLADO");
		}
	
		a = a.toUpperCase();
		letra = letra.toUpperCase();
		
		int cont = a.indexOf(letra);
		int qtde = 1;
		
		if(cont >= 0){
			System.out.println("\nA letra "+letra+" aparece nas posicoes: \n");
			System.out.println(a.indexOf(letra));
	
			while(cont < a.lastIndexOf(letra)){
				cont++;
				qtde++;
				System.out.println(a.indexOf(letra, cont++));
			}
			System.out.println("\nA quantidade de vezes que aparece: "+qtde++);
		}
		else if(cont == -1){
			System.out.println("\nA letra "+letra+" nao existe na frase!");
		}
	}
} 
