package br.com.sobraldev.sreenmatch.calculos;

import br.com.sobraldev.screenmatch.modelos.Filme;
import br.com.sobraldev.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void incluir(Titulo titulo){
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
