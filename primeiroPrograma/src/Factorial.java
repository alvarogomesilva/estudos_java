import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numberUser = input.nextInt();
        int fatorial = 1;

        for (int i = numberUser; i >= 1; i--) {
            System.out.println(i);
            fatorial *= i;
        }
        System.out.println("Fatorial: "+ fatorial);
    }
}
