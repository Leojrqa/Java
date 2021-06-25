import java.util.Scanner;

public class exercicio_dex 
{
    public static void main (String[] arf)
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        for(int i=1; i<=n; i++)
        {
            int q = i*i;
            int c = i*i*i; 
            System.out.println(i + " " + q + " " + c);
        }

        sc.close();
    }    
}
