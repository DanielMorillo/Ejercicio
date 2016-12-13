import java.util.*;
public class Ejercicio1A{
	public static void main(String args[]){
	 Scanner sc= new Scanner(System.in);
	System.out.println("Introduce el primer numero");
	 int numero1 = sc.nextInt();
	System.out.println("Introduce el segundo numero");
	 int numero2 = sc.nextInt();
	sc.close();
	int ValorMenor = 0;
	int ValorMayor = 0;
	if(numero1==numero2)
		System.out.printf("Los numeros %d y %d son iguales%n",numero1,numero2);
	  if(numero1>numero2){
		 ValorMayor=numero1;
		 ValorMenor=numero2;
		}
	  if(numero1<numero2){
		ValorMayor=numero2;
		ValorMenor=numero1;
		}
	System.out.printf("El numero mayor es %d y el menor es %d%n",ValorMayor,ValorMenor,calcularValorMedio(media));
	 While(ValorMenor<=ValorMayor){
	   System.out.printf("%d%n",ValorMenor);
	   ValorMenor++;
	 }
	System.out.printf("La media de %d y %d es:%.2d",ValorMayor,ValorMenor,calcularValorMedio(media));
	}
	
	public static double calcularValorMedio(int ValorMenor, int ValorMayor){
	 int media = 0;
	 media = (ValorMenor+ValorMayor)/2;
	return media;
	 }

}
