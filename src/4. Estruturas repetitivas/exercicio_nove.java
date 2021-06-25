import java.util.Scanner;

public class exercicio_nove 
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=1; i<=n; i++)
        {
            int mod = n%i;
            if(mod == 0)
            {
                System.out.println(i);
            }
        }

        sc.close();
    }    
}
