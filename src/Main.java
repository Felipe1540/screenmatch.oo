public class Main {
    public static void main(String[] args) {
        Film meuFilme = new Film();

        meuFilme.setName("A volta dos que não foram");
        meuFilme.setAnoDeLancamento(2000);
        meuFilme.setDuracaoEmMinutos(230);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(3);
        meuFilme.avalia(5);
        meuFilme.avalia(7);
        meuFilme.avalia(10);
        System.out.println(meuFilme.getSomaDasAvaliacoes());
        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.retornaMedia());

        Film favorito = new Film();

        favorito.setName("The Matrix");
        favorito.setAnoDeLancamento(1999);
        favorito.setDuracaoEmMinutos(135);
        favorito.setInclusoNoPlano(true);

        favorito.exibeFichaTecnica();
        favorito.avalia(9);
        favorito.avalia(8);
        favorito.avalia(9);

        System.out.println("Média de avaliações do filme: " +favorito.retornaMedia());
    }
}