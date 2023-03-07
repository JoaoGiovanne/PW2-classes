public class AnimeTeste {
    public static void main(String[] args) {
        Anime meuAnime = new Anime();
        meuAnime.nome = "Super11";
        meuAnime.quantidadeEpisodios = 32;
        meuAnime.temporadas = 5;

        Anime meuAnimePreferido = new Anime();
        meuAnimePreferido.nome = "Naruto";
        meuAnimePreferido.quantidadeEpisodios = 327;
        meuAnimePreferido.temporadas = 5;
        System.out.println(meuAnime.nome);
    }
}
