//Nome: Igor Araujo de Mattos - RA: 2346443

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Menu{
	public static void main(String arg[]){

		System.out.println("\nInforme o primeiro valor: ");

		InputStreamReader teclado1 = new InputStreamReader(System.in);
		BufferedReader buff1 = new BufferedReader(teclado1);

		String a = "";

		try{
			a = buff1.readLine();
		}
		catch(IOException ioe){
			System.out.println("\nERRO de sistema: RAM - TECLADO");
		}
		
		int num1 = Integer.parseInt(a);

		System.out.println("\nInforme o segundo valor: ");

		InputStreamReader teclado2 = new InputStreamReader(System.in);
		BufferedReader buff2 = new BufferedReader(teclado2);

		String b = "";

		try{
			b = buff2.readLine();
		}
		catch(IOException ioe){
			System.out.println("\nERRO de sistema: RAM - TECLADO");
		}

		int num2 = Integer.parseInt(b);
		
		System.out.println("\nMenu de operacao: ");
		System.out.println("\n1- Somar (a + b)");
		System.out.println("\n2- Subtrair (a - b)");
		System.out.println("\n3- Multiplicat (a * b)");
		System.out.println("\n4- Dividir (a / b )\n");

		InputStreamReader teclado3 = new InputStreamReader(System.in);
		BufferedReader buff3 = new BufferedReader(teclado3);

		String operad = "";

		try{
			operad = buff3.readLine();
		}
		catch(IOException ioe){
			System.out.println("\nERRO de sistema: RAM - TECLADO");
		}

		int c = Integer.parseInt(operad);
		int x = 0;

		switch(c){
			case 1:
			x = num1 + num2;
			System.out.println("\nA soma de a + b eh: "+x);
			break;
			case 2:
			x = num1 - num2;
			System.out.println("\nA subtracao de a + b eh: "+x);
			break;
			case 3:
			x = num1 * num2;
			System.out.println("\nA mutiplicacao de a + b eh: "+x);
			break;
			case 4:
			x = num1 / num2;
			System.out.println("\nA divisao de a + b eh: "+x);
			break;
		}
		
	}
} 
