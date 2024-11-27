import java.util.Scanner;

public class PositiveOrNegative {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int numberUser = input.nextInt();

        if (numberUser > 0) {
            System.out.println("O número é positivo");
        } else {
            System.out.println("O número é negativo");
        }
    }


}
