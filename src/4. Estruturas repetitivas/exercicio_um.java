import java.util.Scanner;

public class exercicio_um 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int senha;

        System.out.print("Digite a senha: ");
        senha = sc.nextInt();

        while(senha != 2002)
        {
            System.out.println("Senha Invalida");
            senha = sc.nextInt();
        }

        System.out.print("Acesso Permitido");

        sc.close();
    }    
}
