import br.com.sobraldev.screenmatch.modelos.Filme;

public class Main {
    public static void main(String[] args) {
        Filme meuFIlme = new Filme();
        //Tipo da variavel  || Guardando dentro de um espaço da memoria

        meuFIlme.setNome("Minecraft");
        meuFIlme.setAnoLancamento(2025);
        meuFIlme.setCategoria("Aventura");
        meuFIlme.setDuracaoEmMinutos(180);
        meuFIlme.setIncluidoNoPlano(true);
        System.out.println("Nome do filme:"+ meuFIlme.getNome());
        meuFIlme.exibeFichaTecnica();

        meuFIlme.avalia(5);
        meuFIlme.avalia(8);
        meuFIlme.avalia(6);
        System.out.println("Total de avaliações: "+meuFIlme.getTotalAvaliacoes());
        System.out.println(meuFIlme.obterMediaAvaliacao());
    }
}