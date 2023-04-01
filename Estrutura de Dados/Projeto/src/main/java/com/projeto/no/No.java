package com.projeto.no;
//No
public class No<T> { // refatorando com generics
    private T conteudo;
    private No proximoNo = null;

    public No(T conteudo) {
        this.proximoNo = null;//fim da estrutura (nó)
        this.conteudo = conteudo;
    }

    public No getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        return "Conteudo= " + conteudo+"\n";
    }
}
