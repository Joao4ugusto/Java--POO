package br.com.alura.screematch.calculos;
import br.com.alura.screematch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Titulo titulo){
        System.out.println("Nome: " + titulo.getNome());
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
