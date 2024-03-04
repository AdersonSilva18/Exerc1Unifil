package exerc3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);

        System.out.println("Escreva o primeiro numero :");
        Integer numero1 = scanner.nextInt();

        System.out.println("Escreva o segundo numero :");
        Integer numero2 = scanner.nextInt();

        System.out.println("Adição: "+ (numero1+numero2));
        System.out.println("Subtração: "+ (numero1 - numero2));
        System.out.println("Divisão: "+ (numero1 / numero2));
        System.out.println("Multiplicação: "+ (numero1 * numero2));
        System.out.println("Sobra: "+ (numero1 % numero2));
    }
}
