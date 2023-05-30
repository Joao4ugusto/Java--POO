package br.com.alura.screematch.calculos;

public class Recomendacoes {
    private String recomendacoes;

    public void filtra(Classificavel classificavel){
      if(classificavel.getClassificacao() >= 4){
          System.out.println("Está entre os preferidos do momento!");
      } else if (classificavel.getClassificacao() >= 2) {
          System.out.println("Muito bem avaliado no momento!");
      } else {
          System.out.println("Coloque na sua lista para ver depois!");
      }
    }
}
