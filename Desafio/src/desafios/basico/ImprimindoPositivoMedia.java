package desafios.basico;

import java.util.Locale;
import java.util.Scanner;

public class ImprimindoPositivoMedia {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        int cont = 0;
        double media = 0;
        double x;

        //Implemente as condições adequadas para obter a quantidade
        //de valores positivos e a média dos valores positivos:
        double total = 0;
        for (int i = 0; i <= 5; i++) {
            x = leitor.nextDouble();
            if (x > 0) {
                cont++;
                total += x;
            }
        }

        leitor.close();
        media = total / cont;
        System.out.println(cont + " valores positivos");
        System.out.println(String.format("%.1f", media));

    }
}
