//Nome: Igor Araujo de Mattos - RA: 2346443

public class Selec1 {
	public static void main(String arg[]){
		int a = 0, b = 20;
		for(a = 0; a <= b; a++){
			if(a > b){
				System.out.println("A eh maior do que B, logo A vale: "+a+" e B vale: "+b);
			}
			else if(a == b){
				System.out.println("A eh igual a B, logo A vale: "+a+" e B vale: "+b);
			}
			else{
				System.out.println("A eh menor do que B, logo A vale: "+a+" e B vale: "+b);
			}
		}
	}
} 
