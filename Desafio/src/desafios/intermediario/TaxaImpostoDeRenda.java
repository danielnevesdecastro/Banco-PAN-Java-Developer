package desafios.intermediario;

import java.util.Locale;
import java.util.Scanner;

public class TaxaImpostoDeRenda {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        double renda = leitor.nextDouble();
        double imposto;

        //Agora utilizando estrutura condicional implemente em seu código as condições necessárias para o cálculo da taxa de imposto de renda:
        if (renda <= 2000) {
            imposto = 0;
        } else if (renda <= 3000) {
            imposto = (renda - 2000) * 0.08;
        } else if (renda <= 4500) {
            imposto = 1000 * 0.08 + (renda - 3000) * 0.18;
        } else {
            imposto = 1000 * 0.08 + 1500 * 0.18 + (renda - 4500) * 0.28;
        }

        if (imposto == 0) {
            System.out.println("Isento");
        } else {
            System.out.printf("R$ %.2f\n", imposto);
        }

    }
}
