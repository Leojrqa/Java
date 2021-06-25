import java.util.Scanner;

public class exercicios_quatro 
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        int h1, h2, duracao;

        System.out.print("Que horas o jogo começou?: ");
        h1 = sc.nextInt();
        System.out.print("Que horas o jogo terminou?: ");
        h2 = sc.nextInt();

        if (h1 < h2)
        {
            duracao = h2 - h1;
        }
        else
        {
            duracao = 24 - h1 + h2;
        }

        System.out.print("O JOGO DUROU " + duracao + " HORAS(S)");

        sc.close();
    }    
}
