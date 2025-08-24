import java.util.Scanner;

// Classe principal, onde o programa começa a execução
public class travel_time {
    // Método principal que inicia o programa
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira a distância e a velocidade média
        System.out.println("Enter the distance:");
        // Lê o número inteiro inserido pelo usuário
        double distance = scanner.nextDouble();
        
        System.out.println("Enter the avarage km/h: ");
        // Lê o número inteiro inserido pelo usuário
        double km_per_hour = scanner.nextDouble();
        
        // Fecha o scanner para evitar vazamentos de recursos
        scanner.close();

        // Chama o método que calcula a mediana e exibe o resultado
        System.out.println(getTime(distance, km_per_hour));
    }

    // Define o método que calcula a mediana de duas notas
    public static double getTime(double distance, double km_per_hour) {
        double time = distance / km_per_hour;
        return time;
    }

}
