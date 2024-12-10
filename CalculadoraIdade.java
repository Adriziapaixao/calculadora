import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CalculadoraIdade {

    public static void main(String args[]){

        System.out.println("\n=== Cálculo de idade ===");
        Scanner scr = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scr.nextLine();

        System.out.println("Digite sua data de nascimento (formato AAAA-MM-DD): ");
        String dataNascimento = scr.nextLine();

        LocalDate dataNasc = LocalDate.parse(dataNascimento);
        LocalDate dataAtual = LocalDate.now();
        int idade = Period.between(dataNasc, dataAtual).getYears();

        System.out.printf("Olá, %s! Você tem %d anos.%n", nome, idade);
        System.out.println("=== Fim da execução ===");

        scr.close();

    }
}
