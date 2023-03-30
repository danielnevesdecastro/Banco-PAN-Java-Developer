package desafios.basico;

import java.util.Locale;
import java.util.Scanner;

public class SomadeHcomNTermos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double h = 0;
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();

        for (double i = 1; i <= n; i++) {
            // Calcule o valor de H de forma que resulte na soma dos termos: H = 1 + 1/2 + 1/3 + 1/4 + ... + 1/N.
            h += +1.0 / i;
        }

        // Imprima a soma dos termos, considerando um resultado com duas casas decimais:
        int soma = (int) Math.round(h);//arredondar para mais
        System.out.println(soma);
    }

}

