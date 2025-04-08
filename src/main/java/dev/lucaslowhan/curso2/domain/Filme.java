package dev.lucaslowhan.curso2.domain;

import dev.lucaslowhan.curso2.calculo.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

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
}
