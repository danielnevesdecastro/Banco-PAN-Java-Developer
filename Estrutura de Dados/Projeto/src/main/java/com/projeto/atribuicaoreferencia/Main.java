package com.projeto.atribuicaoreferencia;
// atribuicao vs referencia
public class Main {
    public static void main(String[] args) {

        int intA = 1;
        int intB = intA;
        System.out.println("intA =" + intA + " intB =" + intB);
        intA = 2;
        System.out.println("intA =" + intA + " intB =" + intB);

        MeuObj a = new MeuObj(1);
        MeuObj b= a;
        System.out.println("Obj A =" + a + " Obj B =" + b);
        a.setNum(2);
        System.out.println("Obj A =" + a + " Obj B =" + b);

    }
}