package br.com.sobraldev.screenmatch.modelos;

public class Filme extends Titulo {
    private String diretor;
     
    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public void exibeFichaTecnica() {
        System.out.println("--------------------------------------------------");
        System.out.println("Ficha Técnica:");
        System.out.println("Nome: " + getNome());
        System.out.println("Ano de Lançamento: " + getAnoLancamento());
        System.out.println("Categoria: " + getCategoria());
        System.out.println("Duração: " + getDuracaoEmMinutos() + " minutos");
        System.out.println("Incluído no Plano: " + (getIncluidoNoPlano() ? "Sim" : "Não"));
        System.out.println("Diretor: " + getDiretor());
        System.out.println("Total de avaliações: "+getTotalAvaliacoes());
        System.out.println(" ");
    }
}
