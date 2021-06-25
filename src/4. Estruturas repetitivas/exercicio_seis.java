import java.util.Scanner;

public class exercicio_seis 
{
    public static void main (String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        Double [] vetor = new Double [3];

        int n = sc.nextInt();

        for(int i=0; i<n; i++)
        {
            double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();

			vetor[i] = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;
        }

        for(int i=0; i<n; i++)
        {
            System.out.printf("%.1f%n", vetor[i]);
        }

        sc.close();
    }
}
