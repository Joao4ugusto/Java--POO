package br.com.alura.screematch.calculos;

import br.com.alura.screematch.modelos.Filme;
import br.com.alura.screematch.modelos.Serie;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Filme f){
        this.tempoTotal += f.getDuracaoEmMinutos();
    }

    public void inclui(Serie s){
        this.tempoTotal += s.getDuracaoEmMinutos();
    }
}
