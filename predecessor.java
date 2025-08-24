import java.util.Scanner;

// Classe principal, onde o programa começa a execução
public class predecessor {
    // Método principal que inicia o programa
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira um número inteiro
        System.out.println("Enter an integer:");
        // Lê o número inteiro inserido pelo usuário
        int number = scanner.nextInt();
        // Fecha o scanner para evitar vazamentos de recursos
        scanner.close();
        
        // Exibe o antecessor do número inserido
        System.out.println(getPredecessor(number));
    }

    // Método que retorna o antecessor de um número inteiro
    public static int getPredecessor(int number) {
        return number - 1;
    }

}
