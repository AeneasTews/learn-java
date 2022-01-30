import java.util.Scanner;

public class MyClass
{
    public static void main(String[] args)
    {
        System.out.println("Hello World!");

        //variables
        int integer = 4;
        String string = "This is a string";
        double floating_point_number = 4.23;

        //user input
        Scanner myVar = new Scanner(System.in);
        System.out.println(myVar.nextLine());

        //arithmetic operators
        int addition = 8 + 3;
        int subtraction = 3 - 5 - 1;
        int multiplication = 5 * 7;
        double division = 9.0 / 2.0;
        int modulo = 18 % 5;
        int division_with_conversion = 10 / 3;

        //increment & decrement
        int a = 5;
        a++;
        System.out.println(a);

        int b = 5;
        int c = b++;
        int d = ++c;
        System.out.println(c);
        System.out.println(d);

        //assignment operators
        int z = 5;
        z += 6;
        z -= 3;
        z *= 9;
        z /= 2;
        z %= 3;
    }
}
