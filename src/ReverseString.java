import java.util.Scanner;

public class ReverseString
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        char[] arr = new char[string.length()];

        for (int i = 0; i < string.length(); i++) {
            arr[arr.length - 1 - i] = string.charAt(i);
        }

        System.out.println(arr);
    }
}
