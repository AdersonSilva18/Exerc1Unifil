package exerc1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);

        System.out.println("Escreva o Ano:");
        Integer ano = scanner.nextInt();

        if (ano % 4 == 0 && (ano % 10 != 0 || ano % 400 == 0)) {
            System.out.println("O Ano é Bissexto");
        }else{
            System.out.println("O Ano nao é Bissexto");
        }
    }
}
