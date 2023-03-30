package desafios.intermediario;

import java.util.Scanner;

public class ContaVogaisEspacos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strSplit = str.split(" ");
        char[] arrVogais = {'a', 'e', 'i', 'o', 'u'};
        int espacosEmBranco = strSplit.length - 1, quantVogais = 0;

        for (String item : strSplit) {
            for (int i = 0; i < item.length(); i++) {
                char stringChar = Character.toLowerCase(item.charAt(i)); // charAt(i) obter caractere da posição i , Character.toLowerCase  = converte em minusculo
                for (char vogal : arrVogais) {
                    if (stringChar == vogal) {
                        quantVogais++;
                    }
                }
            }

            //Implemente condições (laços) adequados para que possamos contar os espaços em brancos e as vogais que existem na string.
            //Dica: Você pode utilizar o Character.toLowerCase em sua condição:

        }
        System.out.println("Espacos em branco: " + espacosEmBranco + " Vogais: " + quantVogais);
    }
}
