import java.util.Scanner;
public class exercicio_tres 
{
	public static void main(String[] args) 
	{
		int A, B, C, D, diferença;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		A = sc.nextInt();
		System.out.print("Digite o segundo valor: ");
		B = sc.nextInt();
		System.out.print("Digite o terceiro valor: ");
		C = sc.nextInt();
		System.out.print("Digite o quarto valor: ");
		D = sc.nextInt();
		
		diferença = (A * B) - (C * D);
		
		System.out.printf("DIFERENÇA = " + diferença);
		
		sc.close();
	}	
}
