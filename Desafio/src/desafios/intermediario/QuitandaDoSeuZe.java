package desafios.intermediario;

import java.util.Locale;
import java.util.Scanner;

public class QuitandaDoSeuZe {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int morangos = input.nextInt();
        int macas = input.nextInt();

        //Implemente as condições necessárias para retornar o preço a ser pago pelo cliente, conforme a tabela de preços do seu Zé:
        double precoMorango = morangos <= 5 ? 2.50: 2.20 ;
        double precoMacas = macas <=5? 1.80: 1.50 ;
        int totalKG = morangos + macas;
        double totalCompras = (morangos  * precoMorango) + (macas * precoMacas);
        double precoFinal = totalKG > 8 || totalCompras > 25.0 ? totalCompras - (0.1 * totalCompras)  : totalCompras ;

        System.out.println(precoFinal);
    }
}
