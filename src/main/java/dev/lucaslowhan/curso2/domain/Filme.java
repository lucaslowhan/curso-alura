package dev.lucaslowhan.curso2.domain;

import dev.lucaslowhan.curso2.calculo.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public Filme(String nome,int anoDeLancamento){
        super(nome,anoDeLancamento);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int)retornarMedia() / 2;
    }

    @Override
    public String toString() {
        return this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}
