package com.projeto.no;
//nó
public class Main {
    public static void main(String[] args) {
        No no1 = new No("Conteudo nó 1");
        No no2 = new No("Conteudo nó 2");
        no1.setProximoNo(no2);
        No no3 = new No("Conteudo nó 3");
        no2.setProximoNo(no3);
        No no4 = new No("Conteudo nó 4");
        no3.setProximoNo(no4);
        //no1 >> no2 >> no3 >> no4 >> null

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());


    }
}
