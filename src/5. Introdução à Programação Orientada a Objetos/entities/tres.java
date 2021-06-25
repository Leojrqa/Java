package entities;

public class tres 
{
    public String nome;
    public double n1, n2, n3, resto;

    public double total()
    {
        return n1 + n2 + n3;
    }

    public double resultado()
    {
        if (total() < 60.0) 
        {
            return 60.0 - total();
        }
        else 
        {
            return 0.0;
        }
    }

}
