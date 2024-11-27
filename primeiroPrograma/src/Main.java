import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numberRandom = new Random().nextInt(100);
        Scanner input = new Scanner(System.in);

        for (int i = 0; i <= 5; i++) {
            System.out.println("Qual o número gerado: ");
            int numberUser = input.nextInt();
            if (numberUser > numberRandom) {
                System.out.println("O número é menor!");
                continue;
            } else if (numberUser < numberRandom) {
                System.out.println("O número é maior!");
                continue;
            } else {
                System.out.println("Você acertou!");
                break;
            }
        }

        System.out.println("O número era "+ numberRandom);
    }
}