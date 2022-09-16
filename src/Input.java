//NAME - Maggie Wu

import java.util.Scanner;

public class Input
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        int intOne, intTwo;
        //add more variables, at least 2 of each type:
        //double, float, short, String
        double doubleOne, doubleTwo;
        float floatOne, floatTwo;
        short shortOne, shortTwo;
        String charOne, charTwo;

        System.out.print("Enter an integer :: ");
        intOne = keyboard.nextInt();
        System.out.print("Enter an integer :: ");
        intTwo = keyboard.nextInt();

        //add in input for all variables

        System.out.print("Enter a double: ");
        doubleOne = keyboard.nextDouble();
        System.out.print("Enter another double: ");
        doubleTwo = keyboard.nextDouble();

        System.out.print("enter a float: ");
        floatOne = keyboard.nextFloat();
        System.out.print("enter another float: ");
        floatTwo = keyboard.nextFloat();

        System.out.print("enter a short: ");
        shortOne = keyboard.nextShort();
        System.out.print("enter another short: ");
        shortTwo = keyboard.nextShort();

        System.out.print("enter a character: ");
        charOne = keyboard.next();
        System.out.print("enter a character: ");
        charTwo = keyboard.next();

        System.out.println();
        System.out.println("integer one = " + intOne );
        System.out.println("integer two = " + intTwo );
        System.out.println("double one = " + doubleOne);
        System.out.println("double two = " + doubleTwo);
        System.out.println("floatOne = " + floatOne);
        System.out.println("floatTwo = " + floatTwo);
        System.out.println("short one = " + shortOne);
        System.out.println("short two = " + shortTwo);
        System.out.println("character one = " + charOne);
        System.out.println("character two = " + charTwo);

        //add output for all variables


    }
}