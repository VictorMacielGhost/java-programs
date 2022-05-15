package aula05;

public class Banco 
{
    /*=============================[Atributos]========================*/
    
    public int numConta;
    protected String tipo;
    private String dono;
    private boolean status;
    private float saldo;


    /*============================[Callbacks]========================*/

    public void OnActionPerformed()
    {
        this.verStatus();
    }


    /*============================[Métodos Especiais]================*/

    public Banco(int numeroconta, String tipoconta, String dono)
    {
        this.setNumConta(numeroconta);
        this.setTipoConta(tipoconta);
        this.setDono(dono);
    }

    public void verStatus()
    {
        String tipoconta = "";
        if(this.getTipoConta().equals("cc")) tipoconta = "Conta Corrente";
        else tipoconta = "Conta Poupança";

        System.out.printf("Status da conta número: %d\nTipo de conta: %s\nDono da conta: %s\nStatus da conta: %s\nSaldo da conta: %.2f\n", this.getNumConta(), tipoconta, this.getDono(), this.getStatus(), this.getSaldo());
    }

    public void setSaldo(float s)
    {
        this.saldo += s;
    }

    public float getSaldo()
    {
        return this.saldo;
    }

    public void setStatus(boolean b)
    {
        this.status = b;
    }

    public boolean getStatus()
    {
        return this.status;
    }

    public String getDono()
    {
        return this.dono;
    }

    public void setDono(String d)
    {
        this.dono = d;
    }

    public String getTipoConta()
    {
        return this.tipo;
    }

    public void setTipoConta(String t)
    {
        this.tipo = t;
    }

    public int getNumConta()
    {
        return this.numConta;
    }

    public void setNumConta(int n)
    {
        this.numConta = n;
    }
    

    /*==============================[Métodos]=========================*/

    public void abrirConta()
    {
        if(this.getStatus() == true) System.out.println("ERRO: Conta Já ativa!");
        else if(this.getTipoConta().equals("cc")) this.setSaldo(150);
        else 
        {
            this.setSaldo(50);
        }
        this.setStatus(true);
        OnActionPerformed();
    }

    public void fecharConta()
    {
        if(this.getSaldo() != 0) System.out.println("ERRO: Você Não pode fechar uma conta com saldo Diferente de zero R$!");
        else if(this.getStatus() == false) System.out.println("ERRO: Conta Fechada!");
        else
        {
            this.setStatus(false);
        }
        OnActionPerformed();
    }

    public void depositar(float d)
    {
        if(this.getStatus() == false) System.out.println("ERRO: Esta conta não é uma conta ativa. Você Não poderá efetuar esta operação.");
        else this.setSaldo(d);
        OnActionPerformed();
    }

    public void sacar(float s)
    {
        if(this.getStatus() == false) System.out.println("ERRO: Esta conta não é uma conta ativa. Você Não poderá efetuar esta operação.");
        else if(this.getSaldo() < s) System.out.println("ERRO: Saldo insuficiente para executar esta operação!");
        else this.setSaldo(-s);
        OnActionPerformed();
    }

    public void pagarMensal()
    {
        if(this.getStatus() == false) System.out.println("ERRO: Esta conta não é uma conta ativa.");
        else
        {
            switch(this.getTipoConta())
            {
                case "cc":
                {
                    this.setSaldo(-12);
                    break;
                }

                default:
                {
                    this.setSaldo(-20);
                }
            }
        }
        OnActionPerformed();

    }

}
