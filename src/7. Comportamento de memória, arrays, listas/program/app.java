package program;

import java.text.ParseException;
import java.util.Scanner;
import Entities.Rent;

public class app 
{
    public static void main(String[] arg) throws ParseException
    {
        
        Scanner sc = new Scanner(System.in);
        Rent[] vect = new Rent[10];

        System.out.print("How many roons will be rented? ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++)
        {
            sc.nextLine();
            System.out.println("Rent #" + i + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            vect[room] = new Rent(name, email);
        }


        System.out.println();
        System.out.println("Bussy Rooms: ");
        for(int i=0; i<10; i++)
        {
            if (vect[i] != null)
            {
                System.out.println(vect[i]);
            }
        }

        sc.close();
    }
}