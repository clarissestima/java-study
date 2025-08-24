import java.util.Scanner;

// Classe principal, onde o programa começa a execução
public class ticket_price {
    // Método principal que inicia o programa
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira a quantidade de membros, crianças e pessoas que pagaram o preço cheio
        System.out.println("Enter the ticket price base:");
        // Lê o número inteiro inserido pelo usuário
        int price = scanner.nextInt();
        
        System.out.println("Enter the number of club members: ");
        // Lê o número inteiro inserido pelo usuário
        int members = scanner.nextInt();

         System.out.println("Enter the number of children with less than ten years of age: ");
        // Lê o número inteiro inserido pelo usuário
        int children = scanner.nextInt();

         System.out.println("Enter the number of people who paid full price: ");
        // Lê o número inteiro inserido pelo usuário
        int people = scanner.nextInt();
        
        // Fecha o scanner para evitar vazamentos de recursos
        scanner.close();

        // Chama os método que calculam as quantidades e exibe o resultado
        System.out.println(getTotalOfPeople(people, members, children));
        System.out.println(getFullValue(people, price, members, getMembersDiscount(members, price)));
        System.out.println(getAllDiscounts(members, children, price, getMembersDiscount(members, price)));
    }

    // Define o método que calcula o total de pessoas
    public static int getTotalOfPeople(int people, int members, int children) {
        return people + members + children;
    }

    // Define o método que calcula o valor total arrecadado
    public static double getFullValue(int people, double price, int members, double discount) {
        double members_value = (price - getMembersDiscount(members, price)) * members;
        double full_value = (people * price) + members_value;
        return full_value;
    }

    // Define o método que calcula o desconto para membros
    public static double getMembersDiscount(int members, double price) {
        double discount = price * 0.30;
        return discount;
    }

    // Define o método que calcula o total de descontos e isenções
    public static double getAllDiscounts(int members, int children, double price, double discount) {
        double members_discount = members * discount;
        double children_discount = children * price;
        return members_discount + children_discount;
    }

}
