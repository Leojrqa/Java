package entities;

public class fix 
{   
    public static double IOF = 0.06;

    public static double total(double dolar, double quant)
    {
        return quant * dolar * (1.0 + IOF);
    }
}
