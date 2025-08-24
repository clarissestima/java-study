import java.util.Scanner;

// Classe principal, onde o programa começa a execução
public class average {
    // Método principal que inicia o programa
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira as duas notas
        System.out.println("Enter the first grade:");
        // Lê o número inteiro inserido pelo usuário
        double grade1 = scanner.nextDouble();
        
        System.out.println("Enter the second grade:");
        // Lê o número inteiro inserido pelo usuário
        double grade2 = scanner.nextDouble();
        
        // Fecha o scanner para evitar vazamentos de recursos
        scanner.close();

        // Chama o método que calcula a media e exibe o resultado
        System.out.println(getGradeAverage(grade1, grade2));
    }

    // Define o método que calcula a media de duas notas
    public static double getGradeAverage(double grade1, double grade2) {
        double median = (grade1 + grade2) / 2.0;
        return median;
    }

}
