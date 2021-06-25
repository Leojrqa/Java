import java.util.Locale;
import java.util.Scanner;
public class exercicios_quatro 
{
	public static void main(String[] args)
	{
		int funcionario, horas;
		double valor, salario;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o numero do funcionario: ");
		funcionario = sc.nextInt();
		System.out.print("Digite as horas trabalhadas: ");
		horas = sc.nextInt();
		System.out.print("Digite o valor por hora ");
		valor = sc.nextDouble();
		
		salario = horas * valor;
		
		System.out.println("NUMBER = " + funcionario);
		Locale.setDefault(Locale.US);
		System.out.printf("SALARY = U$ " + "%.2f%n", salario);
		
		sc.close();
	}
}