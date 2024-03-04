package exerc6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);

        System.out.println("Escreva o valor em metros :");
        Float medida = scanner.nextFloat();


        System.out.println("Valor em quilometros: "+ (medida/1000));
        System.out.println("Valor em centimetros: "+ (medida*100));
        System.out.println("Valor em decimetros: "+ (medida*1000));
        System.out.println("Valor em decametros: "+ (medida*10000));
        System.out.println("Valor em hectometro: "+ (medida*100000));
    }
}
