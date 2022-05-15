package operadorternario;

public class OperadorTernario
{
    public static void main(String[] args)
    {
        int n1 = 5;
        int n2 = 10;

        int maior;

        maior = (n1 > n2) ? n1 : n2;

        System.out.println("Maior = " + maior);

    }
}