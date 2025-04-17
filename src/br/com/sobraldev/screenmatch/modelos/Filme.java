package br.com.sobraldev.screenmatch.modelos;

public class Filme {
    private String nome;
    private String categoria;
    private int anoLancamento;
    private boolean incluidoNoPlano;
    private double Somavaliacao;
    private int totalAvaliacoes;
    private int duracaoEmMinutos;


    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public double getSomavaliacao() {
        return Somavaliacao;
    }

    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
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
