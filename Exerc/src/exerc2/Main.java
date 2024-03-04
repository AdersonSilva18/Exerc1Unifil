package exerc2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);

        System.out.println("Escreva um numero:");
        Integer numero = scanner.nextInt();


        System.out.println("Valor: "+  numero);
        System.out.println("O Dobro do valor: "+ numero *2);
        System.out.println("O Triplo do valor: "+ numero*3);
        System.out.println("A metade do valor: "+ numero/2);
    }
}
