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
        
        //Strings
        String s = "This is a string";
        char character = 'a';
        System.out.println(s);
        System.out.println(character);
        s = "string";
        System.out.println("This is a concatenated " + s);

        //Conditional Statements
        boolean condition = true;
        if (condition) {
            System.out.println("Condition is true");
        }
        if (condition)
            System.out.println("Short statement");
        /*
        comparison operators:
        <
        >
        <=
        >=
        !=
        ==
         */

        if (!condition)
        {
            System.out.println("This will never run");
        } else
        {
            System.out.println("This will run!");
        }

        if (condition)
        {
            if (condition)
            {
                System.out.println("This is a nested statement");
            }
        }

        if (!condition)
        {
            System.out.println("This will also never run, so I am wondering why I am even typing this?");
        } else if (condition)
        {
            System.out.println("This uses else if to check, I can also add another else statement or more else if statements if I like");
        } else {
            System.out.println("This is also never going to run");
        }

        if (condition && condition)
        {
            if (condition || condition)
            {
                System.out.println("The and operator and the or operator are used like in most other languages. The not operator was used previously.");
            }
        }

        int test = 45;
        switch (test)
            {
            case 46:
                System.out.println("Never gonna give yo .. ups, run!");
                break;
            case 45:
                System.out.println("This is gonna run!");
                break;
            default:
                System.out.println("If I didn't have the break statement in the previous case, it would run this statement as well");
            }

        int day = 4;
        String dayType = switch(day)
                {
                case 1, 2, 3, 4, 5 -> "Working day";
                case 6, 7 -> "Weekend";
                default -> "did you break time??";
                };

        //Loops
        int l = 3;

        while(l > 3) {
            System.out.println(l);
            l--;
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        int i = 0;

        do {
            System.out.println(i);
            i++;
        } while (i < 5);

        for (i = 0; i < 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("Broke loop");

        for (i = 0; i < 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
    }
}