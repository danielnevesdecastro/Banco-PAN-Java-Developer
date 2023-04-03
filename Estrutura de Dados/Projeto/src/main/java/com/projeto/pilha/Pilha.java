package com.projeto.pilha;

//Pilha
public class Pilha {

    private No refNoEntrada;

    public Pilha() {
        this.refNoEntrada = null;

    }

    public No top() {
        return refNoEntrada;
    }

    public void push(No novoNo) {
        No refAuxiliar = refNoEntrada; // guardo ref de  topo
        refNoEntrada = novoNo; //nova ref , no q terminei de empilhar
        refNoEntrada.setRefNo(refAuxiliar);//o novo no tem como ref  a antiga ref de topo
    }

    public No pop(){
        if(!this.isEmpty()){
            No noPoped = refNoEntrada;
            refNoEntrada= refNoEntrada.getRefNo();
            return noPoped;
        }
        return null;
    }


    public boolean isEmpty() {
        return refNoEntrada == null ? true : false;

    }


}
