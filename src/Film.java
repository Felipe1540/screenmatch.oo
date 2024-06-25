public class Film {
    String name;
    int anoDeLancamento; //releaseYear;
    boolean inclusoNoPlano; //included;
    private double somaDasAvaliacoes; //rate;
    private int totalDeAvaliacoes; //totalRate
    int duracaoEmMinutos; //durationInMin;

    int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + name);
        System.out.println("Ano de lançamento: " + inclusoNoPlano);
    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes ++;
    }

    double retornaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
