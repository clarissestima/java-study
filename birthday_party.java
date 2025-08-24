import java.util.Scanner;

// Classe principal, onde o programa começa a execução
public class birthday_party {
    // Método principal que inicia o programa
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira a quantidade de homens, mulheres e crianças
        System.out.println("Enter the number of men:");
        // Lê o número inteiro inserido pelo usuário
        int men = scanner.nextInt();
        
        System.out.println("Enter the number women: ");
        // Lê o número inteiro inserido pelo usuário
        int women = scanner.nextInt();

         System.out.println("Enter the number of children: ");
        // Lê o número inteiro inserido pelo usuário
        int children = scanner.nextInt();
        
        // Fecha o scanner para evitar vazamentos de recursos
        scanner.close();

        // Chama os método que calculam as quantidades e exibe o resultado
        System.out.println(getMensMeatQuantity(men));
        System.out.println(getWomensMeatQuantity(women));
        System.out.println(getChildrensMeatQuantity(children));
    }

    // Define os métodos que calculam as quantidades de carne
    public static double getMensMeatQuantity(int men) {
        double quantity = men * 400.0;
        quantity += quantity * 0.20;
        return quantity;
    }
    
    public static double getWomensMeatQuantity(int women) {
        double quantity = women * 320.0;
        quantity += quantity * 0.20;
        return quantity;
    }

    public static double getChildrensMeatQuantity(int children) {
        double quantity = children * 200.0;
        quantity += quantity * 0.20;
        return quantity;
    }

}
