package condicionais;

import java.util.Scanner;

public class Condicionais 
{
    public static void main(String[] args)
    {

        try (Scanner teclado = new Scanner(System.in)) {
            int inputtext = teclado.nextInt();

            String tipo;

            switch(inputtext)
            {
                case 1:
                {
                    tipo = "Saci";
                    break;
                }

                case 2:
                {
                    tipo = "Bípede";
                    break;
                }

                case 4:
                {
                    tipo = "Quadrúpede";
                    break;
                }

                case 6, 8:
                {
                    tipo = "Aranha";
                    break;
                }

                default:
                {
                    tipo = "ET";
                }
            }
            System.out.println(tipo);
        }
    }    
}
