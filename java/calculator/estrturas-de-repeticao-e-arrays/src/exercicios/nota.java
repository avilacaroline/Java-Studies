package exercicios;

import java.util.Scanner;

public class nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cash;

        System.out.println("Digite um valor entre 0 e 10: ");
        cash = scan.nextInt();

        while (cash < 0 || cash > 10) {
                System.out.println("Número inválido. Digite novamente:");
                cash = scan.nextInt();
        }

    }
}
