import java.util.Scanner;

// Classe principal, onde o programa começa a execução
public class plus_twenty_percent {
    // Método principal que inicia o programa
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira um número inteiro
        System.out.println("Enter an double:");
        // Lê o número inteiro inserido pelo usuário
        float number = scanner.nextFloat();
        // Fecha o scanner para evitar vazamentos de recursos
        scanner.close();
        
        // Exibe 20% do número inserido
        System.out.println(getPercentage(number));
    }

    // Método que retorna 20% de um número inteiro
    public static float getPercentage(float number) {
        number += (number * 0.20);
        return number;
    }
}
