package calculator;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;

        System.out.println("Digite o primeiro valor:");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor:");
        b = scan.nextInt();

       int plus = plus(a,b);
       int sub = sub(a, b);
       int multi = multi(a,b);
       int div = div(a,b);

        System.out.println("Plus: " + plus);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + multi);
        System.out.println("Division: " + div);

    }

    public static int plus(int a, int b){
        return a + b;
    }

    public static int sub(int a, int b){
        return a - b;
    }

    public static int multi(int a, int b){
        return a * b;
    }

    public static int div(int a, int b){
        return a / b;
    }
}
