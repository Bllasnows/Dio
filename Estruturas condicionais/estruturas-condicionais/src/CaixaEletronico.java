import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            double saldo = 27.00;  
            
            System.out.println("Você possui R$ " + saldo + " de saldo em nosso sistema. Informe o valor para saque:");
            double valorSolicitado = scanner.nextDouble();
            
            if(valorSolicitado < saldo){ // Em java, estruturas de repetição com mais de uma instrução ultilizamos os {}
                saldo = saldo - valorSolicitado;
                System.out.println("Seu novo saldo é: R$ " + saldo);
                
            }else
                System.out.println("Valor insuficiente para saque! Você possui R$ " + saldo + "em conta.");
        }

    }
}
