import java.util.Scanner;

// Classe principal, onde o programa começa a execução
public class powered_by_two {
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
        
        // Exibe a potência do número inserido
        System.out.println(getPower(number));
    }

    // Método que retorna a potência de um número inteiro
    public static double getPower(int number) {
        double power = Math.pow(number, 2);
        return power;
    }

}
