package entities;

public class dois 
{
    public String name;
    public double salary, tax;

    public double salario()
    {
        return salary - tax;
    }

    public void total(double percent)
    {
        salary += salary * percent / 100.0;
    }

    public String toString()
    {
        return name + ", $ " + String.format("%.2f", salario());
    }

}
