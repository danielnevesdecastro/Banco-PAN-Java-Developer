package com.projeto.no;
//No
public class No {
    private String conteudo;
    private No proximoNo;

    public No(String conteudo) {
        this.proximoNo = null;//fim da estrutura (nó)
        this.conteudo = conteudo;
    }

    public No getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        return "Conteudo= " + conteudo+"\n";
    }
}
