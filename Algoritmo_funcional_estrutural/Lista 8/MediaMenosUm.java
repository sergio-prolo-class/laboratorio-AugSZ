package ifsc.alg.aula11;

import java.io.PrintStream;
import java.util.Scanner;

public class MediaMenosUm {
    
    static final PrintStream OUT = System.out;
    static final Scanner IN = new Scanner(System.in);
    public static void main(String[] args) {
        double mediaProvas, mediaTrabalhos;
        Scanner sc = new Scanner(System.in);
        OUT.println("Digite a quantidade de alunos para pegar as notas:");
        double i = IN.nextDouble();
        for (i = i; i>0; i--){
            System.out.println("Entre com as notas das provas: ");
            mediaProvas = pegarNotas(); // pega a nota das provas
            System.out.println("Entre com as notas dos trabalhos: ");
            mediaTrabalhos = pegarNotas();
            System.out.printf("Média final: %.2f%n", calcularMediaFinal(mediaProvas, mediaTrabalhos));
            OUT.printf("Aluno n");
        }
    }

    static double pegarNotas() {
        Scanner sc = new Scanner(System.in);
        double mediaNotas;
        return mediaNotas = calcularMediaDosMaiores(sc.nextDouble(), sc.nextDouble(), sc.nextDouble()); 
    }
    // Aqui ele recebe as notas e calcula a média das duas maiores
    static double calcularMediaDosMaiores(double x1, double x2, double x3) {
        if (x1<0 || x1>10 || x2<0 || x2>10 || x3<0 || x3>10) {
            OUT.println("Valor inválido tente novamente:");
            return pegarNotas();
        }
        return (x1 + x2 + x3 - menorNota(x1, x2, x3)) / 2;
    }

    static double menorNota(double nota1, double nota2, double nota3) {
        double min = nota1; // declaramos a nota1 como menor nota
        if (nota2 < min) { // atualiza o valor de min se a nota2 for menor
            min = nota2;
        }
        if (nota3 < min) { // atualiza o valor de min se a nota3 for menor
            min = nota3;
        }
        return min;
    }

    static double calcularMediaFinal(double p, double t) {
        return 0.8 * p + 0.2 * t;
    }
}
