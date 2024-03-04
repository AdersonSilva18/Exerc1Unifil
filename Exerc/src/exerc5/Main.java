package exerc5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);

        System.out.println("Escreva o primeiro numero de peso 2:");
        Integer numero1 = scanner.nextInt();
        System.out.println("Escreva o primeiro numero de peso 3:");

        Integer numero2 = scanner.nextInt();
        System.out.println("Escreva o primeiro numero de peso 5:");

        Integer numero3 = scanner.nextInt();

        Integer media = (numero1*2 + numero2*3 + numero3*5)/10;

        System.out.println("Media dos valores: "+ media);
    }
}
