import java.util.Scanner;

// Classe principal, onde o programa começa a execução
public class election_percentage {
    // Método principal que inicia o programa
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira os dados da eleição
        System.out.println("Enter the total number of voters:");
        // Lê o número inteiro inserido pelo usuário
        double total_number_voters = scanner.nextDouble();
        
        System.out.println("Enter the number of valid votes: ");
        // Lê o número inteiro inserido pelo usuário
        double valid_vote = scanner.nextDouble();

         System.out.println("Enter the number of white votes: ");
        // Lê o número inteiro inserido pelo usuário
        double white_vote = scanner.nextDouble();

         System.out.println("Enter the number of null votes: ");
        // Lê o número inteiro inserido pelo usuário
        double null_vote = scanner.nextDouble();
        
        // Fecha o scanner para evitar vazamentos de recursos
        scanner.close();

        // Chama os método que calculam as porcentagens e exibe o resultado
        System.out.println(getValidVotesPercentage(total_number_voters, valid_vote));
        System.out.println(getWhiteVotesPercentage(total_number_voters, white_vote));
        System.out.println(getNullVotesPercentage(total_number_voters, null_vote));
    }

    // Define os métodos que calculam as porcentagens de votos
    public static double getValidVotesPercentage(double total_number_voters, double valid_vote) {
        double percentage = (valid_vote / total_number_voters) * 100.0;
        return percentage;
    }

    public static double getWhiteVotesPercentage(double total_number_voters, double white_vote) {
        double percentage = (white_vote / total_number_voters) * 100.0;
        return percentage;
    }

    public static double getNullVotesPercentage(double total_number_voters, double null_vote) {
        double percentage = (null_vote / total_number_voters) * 100.0;
        return percentage;
    }

}
