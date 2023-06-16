package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        Filme outroFilme = new Filme("Avatar", 2023);
        Filme filmeDoJoao = new Filme("boruto", 2018);
        Serie lost = new Serie("avatar", 2002);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(filmeDoJoao);
        lista.add(lost);

        for (Titulo item: lista) {
            System.out.println(item.getNome());
        }

    }
}
