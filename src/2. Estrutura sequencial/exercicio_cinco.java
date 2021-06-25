import java.util.Locale;
import java.util.Scanner;

public class exercicio_cinco 
{
	public static void main(String[] args)
	{
		int cod_um, cod_dois, peca_um, peca_dois;
		double valor_um, valor_dois, total;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite codigo do primeiro produto: ");
		cod_um = sc.nextInt();
		
		System.out.print("Digite a quantidade do primeiro produto: ");
		peca_um = sc.nextInt();
		
		System.out.print("Digite o valor do primeiro produto: ");
		valor_um = sc.nextDouble();
		
		System.out.print("Digite codigo do segundo produto: ");
		cod_dois = sc.nextInt();
		
		System.out.print("Digite a quantidade do segundo produto: ");
		peca_dois = sc.nextInt();
		
		System.out.print("Digite o valor do segundo produto: ");
		valor_dois = sc.nextDouble();
		
		total = (valor_um * peca_um) + (valor_dois * peca_dois);
		
		Locale.setDefault(Locale.US);
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		sc.close();
	}
}
