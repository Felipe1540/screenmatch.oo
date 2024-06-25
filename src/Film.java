public class Film {
    String name;
    int anoDeLancamento; //releaseYear;
    boolean inclusoNoPlano; //included;
    double somaDasAvaliacoes; //rate;
    int totalDeAvaliacoes; //totalRate
    int duracaoEmMinutos; //durationInMin;

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
