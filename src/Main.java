import br.com.sobraldev.screenmatch.modelos.Filme;

public class Main {
    public static void main(String[] args) {
        Filme meuFIlme = new Filme();
        //Tipo da variavel  || Guardando dentro de um espaço da memoria

        meuFIlme.nome = "Minecraft";
        meuFIlme.anoLancamento = 2025;
        System.out.println("Hello, World!"+ meuFIlme.nome);
        meuFIlme.exibeFichaTecnica();

        meuFIlme.avalia(5);
        meuFIlme.avalia(8);
        meuFIlme.avalia(6);
        System.out.println("Total de avaliações: "+meuFIlme.getTotalAvaliacoes());
        System.out.println(meuFIlme.obterMediaAvaliacao());
    }
}