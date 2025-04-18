import br.com.sobraldev.screenmatch.modelos.Filme;
import br.com.sobraldev.screenmatch.modelos.Serie;
import br.com.sobraldev.sreenmatch.calculos.CalculadoraDeTempo;

public class Main {
    public static void main(String[] args) {
        Filme meuFIlme = new Filme();
        //Tipo da variavel  || Guardando dentro de um espaço da memoria

        meuFIlme.setNome("Minecraft");
        meuFIlme.setAnoLancamento(2025);
        meuFIlme.setCategoria("Aventura");
        meuFIlme.setDuracaoEmMinutos(101);
        meuFIlme.setIncluidoNoPlano(true);
        meuFIlme.setDiretor("Jared Hess");
        meuFIlme.avalia(5);
        meuFIlme.avalia(8);
        meuFIlme.avalia(6);
        System.out.println(meuFIlme.obterMediaAvaliacao());
        meuFIlme.exibeFichaTecnica();

        Serie minhaSerie = new Serie();
        minhaSerie.setNome("Exploradores do Universo");
        minhaSerie.setAnoLancamento(2023);
        minhaSerie.setTemporadas(3);
        minhaSerie.setEpisodiosPorTemporadas(10);
        minhaSerie.setAtiva(true);
        minhaSerie.setMinutosPorEpisodio(45);

        // Exibindo as informações da série
        minhaSerie.exibeFichaTecnica();

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        calculadora.incluir(minhaSerie);
        System.out.println(calculadora.getTempoTotal());
    }
}