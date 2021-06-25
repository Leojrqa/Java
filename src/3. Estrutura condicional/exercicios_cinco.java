import java.util.Scanner;

public class exercicios_cinco 
{
    public static void main(String[] arg)
        {
            Scanner sc = new Scanner(System.in);
            int cod, quant;
            double total; 

            System.out.print("Digite o numero do item: ");
            cod = sc.nextInt();
            System.out.print("Digite a quantidade: ");
            quant = sc.nextInt();

            if (cod == 1)
            {
                total = quant * 4.00;
            }
            else if (cod == 2)
            {
                total = quant * 4.50;
            }
            else if (cod == 3)
            {
                total = quant * 5.00;
            }
            else if (cod == 4)
            {
                total = quant * 2.00;
            }
            else
            {
                total = quant * 1.50;
            }

            System.out.printf("Total: R$ %.2f%n", total);

            sc.close();
        }
}
