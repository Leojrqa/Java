import java.util.Scanner;

public class Exercicio_tres 
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        int codigo, gasolina, alcool, diesel;

        codigo = sc.nextInt();
        gasolina = 0;
        alcool = 0;
        diesel = 0;

        while(codigo != 4)
        {
            if(codigo == 1)
            {
                alcool += 1;
                codigo = sc.nextInt();
            }
            else if(codigo == 2)
            {
                gasolina += 1;
                codigo = sc.nextInt();
            }
            else if(codigo == 3)
            {
                diesel += 1;
                codigo = sc.nextInt();
            }
            else
            {
                codigo = sc.nextInt();
            }
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}
