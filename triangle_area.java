import java.util.Scanner;

// Classe principal, onde o programa começa a execução
public class triangle_area {
    // Método principal que inicia o programa
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira a base e a altura do triângulo
        System.out.println("Enter the base of the triangle:");
        // Lê o número inteiro inserido pelo usuário
        int base = scanner.nextInt();
        
        System.out.println("Enter the height of the triangle:");
        // Lê o número inteiro inserido pelo usuário
        int height = scanner.nextInt();
        
        // Fecha o scanner para evitar vazamentos de recursos
        scanner.close();

        // Exibe a área do triângulo
        System.out.println(getTriangleArea(base, height));
    }

    // Método que retorna a área de um triângulo
    public static double getTriangleArea(int base, int height) {
        double area = (base * height) / 2.0;
        return area;
    }

}
