import java.util.Scanner;

public class LoanCalculator
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int loan = scanner.nextInt();

        for (int i = 0; i < 3; i++) {
            loan -= loan / 10;
        }

        System.out.println(loan);
    }
}
