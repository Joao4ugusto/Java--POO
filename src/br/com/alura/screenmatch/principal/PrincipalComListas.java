package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        Filme outroFilme = new Filme("Avatar", 2023);
        Filme filmeDoJoao = new Filme("boruto", 2018);

        ArrayList<Filme> listaDeFimes = new ArrayList<>();
        listaDeFimes.add(meuFilme);
        listaDeFimes.add(outroFilme);
        listaDeFimes.add(filmeDoJoao);
    }
}
