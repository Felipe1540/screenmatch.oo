public class Main {
    public static void main(String[] args) {
        Film meuFilme = new Film();

        meuFilme.name = "A volta dos que não foram";
        meuFilme.anoDeLancamento = 2000;
        meuFilme.duracaoEmMinutos = 230;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(3);
        meuFilme.avalia(5);
        meuFilme.avalia(7);
        meuFilme.avalia(10);
        System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println(meuFilme.retornaMedia());

    }
}