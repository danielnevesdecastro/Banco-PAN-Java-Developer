package desafios.intermediario;

import java.util.Locale;
import java.util.Scanner;

public class Animal {
    public static void main(String[] args) {
        //Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        String AN1, AN2, AN3;

        AN1 = sc.nextLine();
        AN2 = sc.nextLine();
        AN3 = sc.nextLine();

        //Implemente as condição necessária para que seja verificado que tipo de animal é:
        int animalTipo = AN1.equalsIgnoreCase("vertebrado") ? 1 : 2;
        String animal = "";
        switch (animalTipo) {

            case 1:
                if (AN2.equalsIgnoreCase("ave")) {
                    animal = AN3.equalsIgnoreCase("carnivoro") ? "aguia" : "pomba";
                } else if (AN2.equalsIgnoreCase("mamifero")) {
                    animal = AN3.equalsIgnoreCase("onivoro") ? "homem" : "vaca";
                }
            case 2:
                if (AN2.equalsIgnoreCase("inseto")) {
                    animal = AN3.equalsIgnoreCase("hematofago") ? "pulga" : "lagarta";
                } else if (AN2.equalsIgnoreCase("anelideo")) {
                    animal = AN3.equalsIgnoreCase("hematofago") ? "sanguessuga" : "minhoca";
                }
        }
        System.out.println(animal);

    }
}
