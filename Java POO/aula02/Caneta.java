package aula02;

public class Caneta 
{
    String modelo = "Bic";
    String cor = "azul";
    float ponta = 0.5f;
    int carga = 100;
    boolean tampada = true;

    void status()
    {
        System.out.println("Modelo " + this.modelo);
        System.out.println("Ponta " + this.ponta);
        System.out.println("Carga " + this.carga);
        System.out.println("Uma Caneta " + this.cor);
        System.out.println("Está Tampada? " + this.tampada);
    }

    void rabiscar()
    {
        if(this.tampada == true) System.out.println("Você Não pode usar uma caneta tampada!");
        else 
        {
            System.out.println("Rabiscando!");
            this.carga -= 1.0;

        }
    }

    void tampar()
    {
        this.tampada = true;
    }

    void destampar()
    {
        this.tampada = false;
    }

}
