package exerc4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);

        System.out.println("Escreva o salario :");
        Double salario = scanner.nextDouble();

        Double acrescimo = salario* 0.15;

        System.out.println("Salario: "+ salario);
        System.out.println("Acrescimo de 15%: "+acrescimo);
        System.out.println("Salario com o acrescimo: "+(salario+acrescimo));
    }
}
