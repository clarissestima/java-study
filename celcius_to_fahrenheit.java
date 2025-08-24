import java.util.Scanner;

// Classe principal, onde o programa começa a execução
public class celcius_to_fahrenheit {
    // Método principal que inicia o programa
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira um número inteiro
        System.out.println("Enter an Celcius value:");
        // Lê o número inteiro inserido pelo usuário
        int celcius = scanner.nextInt();
        // Fecha o scanner para evitar vazamentos de recursos
        scanner.close();
        
        // Exibe o valor em Fahrenheit do valor inserido
        System.out.println(getFahrenheit(celcius));
    }

    // Método que retorna o valor em Fahrenheit de um valor em Celsius
    public static double getFahrenheit(int celcius) {
        double fahrenheit = (celcius * 9/5) + 32;
        return fahrenheit;
    }
}
