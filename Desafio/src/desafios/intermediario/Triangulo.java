package desafios.intermediario;

import java.util.Locale;
import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double C = leitor.nextDouble();
        double maior;
        double soma;
        boolean triangulo;
        leitor.close();
        //Implemente a condição necessária para o cálculo do triângulo:
        //Dica: Você pode utilizar o String.format() na formatação do texto.

        triangulo = A + B > C && A + C > B && C + B > A;
        String msg;
        if (triangulo) {
            soma = A + B + C;
            msg = String.format("Perimetro = %.1f", soma );
        }else{
            maior =  ((A + B) * C) / 2;
            msg = String.format("Area = %.1f",maior);
        }

        System.out.println(msg);

    }
}
