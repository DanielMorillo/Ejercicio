import java.util.Scanner;
public class Ejercicio2A{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce una frase:");
		String frase=sc.nextLine();
		System.out.println(concatenarMayusculaMinuscula(frase));
		System.out.printf("La frase tiene %d C y Z%n",numeroCyZ(frase));
		System.out.printf("La frase tiene %d palabras%n",numeroPalabras(frase));
	}
	public static int numeroCyZ(String frase){
		
		int contador=0;
		for(int i=0;i<frase.length();i++){
			if(frase.charAt(i)=='c'
			  ||frase.charAt(i)=='z'
			  ||frase.charAt(i)=='C'
			  ||frase.charAt(i)=='Z')
				contador++;
		}
		return contador;
	}
	public static String concatenarMayusculaMinuscula(String frase){
		return frase.toUpperCase()+frase.toLowerCase();
	}
	public static int numeroPalabras(String frase){
		
		int contador=0;
		for(int i=0;i<frase.length();i++)
			if(frase.charAt(i)==' ')
				contador++;
		if(frase.length()==0)
			contador=-1;
		return contador+1;
	}
}
