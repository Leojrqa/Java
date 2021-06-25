package entities;

import program.app;

public class Bank 
{
    private int numcon;
    private String nome;
    private double deposito;

    public Bank(int numcon, String nome, double deposito)
    {
        this.numcon = numcon;
        this.nome = nome;
        this.deposito = deposito;
    }

    public int getConta()
    {
        return numcon;
    }

    public String toString()
    {
        return "Account " 
                        + numcon 
                        + ", Holder: " 
                        + nome 
                        + ", Balance: $ " 
                        + String.format("%.2f", deposito);
    }
}
