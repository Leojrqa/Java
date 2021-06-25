import java.util.Scanner;
import java.util.Locale;
public class exercicio_dois 
{
	public static void main(String[] args)
	{
		double pi, raio, area;
		pi = 3.14159;
		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		System.out.print("Digite o valor do raio: ");
		raio = sc.nextDouble();
		
		area = pi * Math.pow(raio, 2);
		
		System.out.printf("AREA = " + "%.4f%n", area);
		
		sc.close();
	}
}
