import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String[] args) {
    
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Digite a nota da sua primeira unidade:");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a nota da sua segunda unidade:");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a nota da sua terceira unidade:");
        double nota3 = scanner.nextDouble();

        System.out.println("Digite a nota da sua quarta unidade:");
        double nota4 = scanner.nextDouble();

        double soma = nota1+nota2+nota3+nota4;
        double media = soma/4;

        System.out.println("Sua média é: " + media);
      
        if(media >= 7)
                System.out.println("Você foi Aprovado!");

            else if(media >=5 && media <7)
                System.out.println(" Pode fazer prova de recuperação!");

            else
                System.out.println("Foi Reprovado!");
    }
    }
}
