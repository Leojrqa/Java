import java.util.Scanner;

public class Exercicio_cinco 
{
    public static void main (String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        int in, out;

        in = 0;
        out = 0;

        int n = sc.nextInt();

        for(int i=0; i<n; i++)
        {
            int x =sc.nextInt();
            if( x >= 10 && x <= 20)
            {
                in += 1;
            }
            else
            {
                out += 1;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");

        sc.close();
    }
}
