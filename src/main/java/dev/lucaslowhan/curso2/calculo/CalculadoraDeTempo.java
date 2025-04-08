package dev.lucaslowhan.curso2.calculo;

import dev.lucaslowhan.curso2.domain.Filme;
import dev.lucaslowhan.curso2.domain.Serie;
import dev.lucaslowhan.curso2.domain.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    public void incluir(Titulo titulo){
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
