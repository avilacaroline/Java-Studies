import java.util.Scanner;

public class multitab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Multiplication table number: ");
        int tab = scan.nextInt();

        System.out.println("Multiplication table of: " + tab);
        for( int i = 1; i <= 10; i++ ){
            System.out.println(tab + " x " + i + " = " + (tab * i));
        }

    }
}
