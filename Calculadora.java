import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("**CALCULADORA**");


        System.out.print("Digite o primeiro número: ");
        double n1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = scanner.nextDouble();

        System.out.println("Escolha a operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("Digite o número correspondente a sua operação:");
        int calculo = scanner.nextInt();

        double resultado;
        boolean calculoValidado = true;

        switch (calculo) {
            case 1:
                resultado = n1 + n2;
                System.out.println("Operação escolhida: Soma");
                System.out.printf("Resultado: %.2f%n", resultado);
                break;

            case 2:
                resultado = n1 - n2;
                System.out.println("Operação escolhida: Subtração");
                System.out.printf("Resultado: %.2f%n", resultado);
                break;

            case 3:
                resultado = n1 * n2;
                System.out.println("Operação escolhida: Multiplicação");
                System.out.printf("Resultado: %.2f%n", resultado);
                break;

            case 4:
                if (n2 != 0) {
                    resultado = n1 / n2;
                    System.out.println("Operação escolhida: Divisão");
                    System.out.printf("Resultado: %.2f%n", resultado);
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida");
                    calculoValidado = false;
                }
                break;
            default:
                System.out.println("Erro: operação inválida");
                calculoValidado = false;
        }

        if (!calculoValidado) {
            System.out.println("Por favor, escolha uma operação válida.");
        }
        scanner.close();
    }
}
