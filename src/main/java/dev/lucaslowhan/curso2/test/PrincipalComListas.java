package dev.lucaslowhan.curso2.test;

import dev.lucaslowhan.curso2.domain.Filme;
import dev.lucaslowhan.curso2.domain.Serie;
import dev.lucaslowhan.curso2.domain.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão",1970);
        meuFilme.avaliar(9);
        Filme outroFilme = new Filme("Avatar",2023);
        outroFilme.avaliar(6);
        Filme filmeDoPaulo = new Filme("Dogville",2003);
        filmeDoPaulo.avaliar(10);
        Serie lost = new Serie("Lost", 2000);

        Filme f1 = filmeDoPaulo;

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for (Titulo titulo:lista){
            if(titulo.getClass().equals(Filme.class)){
                System.out.println("Filme: " + titulo + ", Classificação: " + ((Filme) titulo).getClassificacao());
            }else if(titulo.getClass().equals(Serie.class)){
                System.out.println("Serie: " + titulo + ", Duração: " + titulo.getDuracaoEmMinutos());
            }
        }
        lista.forEach(System.out::println);

        List<String> buscaPorArtista = new LinkedList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jacqueline");
        Collections.sort(buscaPorArtista);
        buscaPorArtista.forEach(System.out::println);

        Collections.sort(lista);
        System.out.println("\nOrdenando por nome");
        lista.forEach(System.out::println);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("\nOrdenando por ano");
        lista.forEach(System.out::println);

        lista.sort(Comparator.comparing(Titulo::getNome).reversed());
        System.out.println("\nOrdem por nome reversa");
        lista.forEach(System.out::println);

    }
}
