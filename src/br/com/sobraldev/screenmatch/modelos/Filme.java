package br.com.sobraldev.screenmatch.modelos;

public class Filme {
    public String nome;
    public String categoria;
    public int anoLancamento;
    public boolean incluidoNoPlano;
    public double Somavaliacao;
    private int totalAvaliacoes;
    public int duracaoEmMinutos;



    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }

    public void setTotalAvaliacoes(int totalAvaliacoes) {
        this.totalAvaliacoes = totalAvaliacoes;
    }

    //metodo
    public void exibeFichaTecnica(){
        System.out.println("Nome do br.com.sobraldev.screenmatch.modelos.Filme: "+ nome);
        System.out.println("Ano de lançamento: "+anoLancamento);
    }

    public void avalia(double nota){
        Somavaliacao += nota;
        totalAvaliacoes += 1;
    }

    public double obterMediaAvaliacao(){
        return (Somavaliacao/totalAvaliacoes);
    }
}
