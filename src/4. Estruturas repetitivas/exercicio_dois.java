import java.util.Scanner;

public class exercicio_dois 
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        int x, y;

        System.out.print("Digite o valor de X: ");
        x = sc.nextInt();
        System.out.print("Digite o valor de Y: ");
        y = sc.nextInt();

        while(x != 0 || y != 0)
        {   
            if(x > 0 && y > 0)
            {
                System.out.println("Primeiro");
                x = sc.nextInt();
                y = sc.nextInt();
            }
            else if(x < 0 && y > 0)
            {
                System.out.println("Segundo");
                x = sc.nextInt();
                y = sc.nextInt();
            }
            else if(x < 0 && y < 0)
            {
                System.out.println("Terceito");
                x = sc.nextInt();
                y = sc.nextInt();
            }
            else if (x > 0 && y < 0)
            {
                System.out.println("Quarto");
                x = sc.nextInt();
                y = sc.nextInt();
            }
            else
            {
                System.out.print("");
            }
        }

        System.out.print("");

        sc.close();
    }    
}
