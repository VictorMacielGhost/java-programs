package aula02;

public class Aula02
{
    public static void main(String[] args)
    {
        Caneta caneta1 = new Caneta();

        caneta1.cor = "Azul";
        caneta1.ponta = 0.5f;
        caneta1.tampada = false;
        caneta1.destampar();
        caneta1.status();
        caneta1.rabiscar();
        caneta1.status();

    }
}