package aula05;

import java.util.Scanner;

public class UsarBanco 
{
    public static void main(String Args[])
    {
        Banco joao = new Banco(1, "cc", "João");
        Scanner Teclado = new Scanner(System.in);

        while(true)
        { 
            int opcao = Teclado.nextInt();
            switch(opcao)
            {
                case 0:
                {
                    joao.abrirConta();
                    break;
                }
                case 1:
                {
                    joao.pagarMensal();
                    break;
                }
                case 2:
                {
                    joao.fecharConta();
                    break;
                }
                case 3:
                {
                    joao.sacar(Teclado.nextFloat());
                    break;
                }
                case 4:
                {
                    joao.depositar(Teclado.nextFloat());
                    break;
                }

                default:
                {
                    System.out.println("ERRO: Opcao Desconhecida!");
                }
            }
        }

    }    
}
