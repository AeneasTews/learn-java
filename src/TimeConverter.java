import java.util.Scanner;

public class TimeConverter
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();

        System.out.println(days *  86400);
    }
}
