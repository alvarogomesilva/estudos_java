import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual número você deseja a tabuada (1 a 10): ");
        int numberUser = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + numberUser + " = " + i*numberUser);
        }
    }
}
