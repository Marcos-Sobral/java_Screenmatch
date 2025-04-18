package br.com.sobraldev.screenmatch.modelos;

public class Serie extends Titulo{
   private int temporadas;
   private int episodiosPorTemporadas;
   private boolean ativa;
   private int minutosPorEpisodio;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporadas() {
        return episodiosPorTemporadas;
    }

    public void setEpisodiosPorTemporadas(int episodiosPorTemporadas) {
        this.episodiosPorTemporadas = episodiosPorTemporadas;
    }

    public boolean getAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return (getEpisodiosPorTemporadas() * getMinutosPorEpisodio())*getTemporadas();
    }

    @Override
    public void exibeFichaTecnica() {
        System.out.println("Nome: " + getNome());
        System.out.println("Ano de Lançamento: " + getAnoLancamento());
        System.out.println("Temporadas: " + getTemporadas());
        System.out.println("Episódios por Temporada: " + getEpisodiosPorTemporadas());
        System.out.println("Série Ativa: " + (getAtiva()? "SIM" : "NÃO"));
        System.out.println("Minutos por Episódio: " + getMinutosPorEpisodio());
        System.out.println("Duração da série: "+ getDuracaoEmMinutos()+" Minutos");
    }
}
