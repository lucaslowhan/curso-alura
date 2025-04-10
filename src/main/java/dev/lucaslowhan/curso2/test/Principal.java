package dev.lucaslowhan.curso2.test;

import dev.lucaslowhan.curso2.calculo.CalculadoraDeTempo;
import dev.lucaslowhan.curso2.calculo.FiltroRecomendacao;
import dev.lucaslowhan.curso2.domain.Episodio;
import dev.lucaslowhan.curso2.domain.Filme;
import dev.lucaslowhan.curso2.domain.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Poderoso chefão",1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibirFichaTecnica();
        meuFilme.avaliar(8);
        meuFilme.avaliar(5);
        meuFilme.avaliar(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalAvaliacoes());
        System.out.println(meuFilme.retornarMedia());

        Serie lost = new Serie("Lost",2000);
        lost.exibirFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar",2023);
        outroFilme.setDuracaoEmMinutos(200);


        CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();
        calculadoraDeTempo.incluir(meuFilme);
        calculadoraDeTempo.incluir(outroFilme);
        calculadoraDeTempo.incluir(lost);
        System.out.println(calculadoraDeTempo.getTempoTotal());

        FiltroRecomendacao filtroRecomendacao = new FiltroRecomendacao();
        filtroRecomendacao.filtrar(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtroRecomendacao.filtrar(episodio);

        Filme filmeDoPaulo = new Filme("DogVille",2003);
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.avaliar(10);

        ArrayList<Filme>filmes = new ArrayList<>();
        filmes.add(meuFilme);
        filmes.add(outroFilme);
        filmes.add(filmeDoPaulo);
        System.out.println("Tamanho da lista: " + filmes.size());
        System.out.println("Primeiro filme: " + filmes.get(0).getNome());
        for (int i = 0; i < filmes.size(); i++) {
            System.out.println(filmes.get(i));
        }

    }
}
