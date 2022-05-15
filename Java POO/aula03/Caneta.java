package aula03;

public class Caneta 
{
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public void status()
    {
        System.out.println("Modelo " + this.modelo);
        System.out.println("Ponta " + this.ponta);
        System.out.println("Carga " + this.carga);
        System.out.println("Uma Caneta " + this.cor);
        System.out.println("Está Tampada? " + this.tampada);
    }


    

    public Caneta(String m, String c, float p, int ca) // método construtor 
    {
        this.tampar();
        this.setPonta(p);
        this.setModelo(m);
        this.carga = ca;
        this.cor = c;

    }

    public float getPonta()
    {
        return this.ponta;
    }

    public void setPonta(float p)
    {
        this.ponta = p;
    }

    public void setModelo(String m)
    {
        this.modelo = m;
    }

    public String getModelo()
    {
        return this.modelo;
    }

    public void rabiscar()
    {
        if(this.tampada == true) System.out.println("Você Não pode usar uma caneta tampada!");
        else 
        {
            System.out.println("Rabiscando!");
            this.carga -= 1.0;

        }
    }

    public void tampar()
    {
        this.tampada = true;
    }

    public void destampar()
    {
        this.tampada = false;
    }

}
