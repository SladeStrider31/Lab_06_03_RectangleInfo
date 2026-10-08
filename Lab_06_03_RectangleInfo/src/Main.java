import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {


        Scanner in = new Scanner(System.in);
        //Declarations
        int length = 0;
        int width = 0;
        double perimeter;
        double diagonal;
        String trash = "";

        System.out.println("What is the length?");
        if (in.hasNextInt())
        {
            length = in.nextInt();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You must have done something wrong. \nTry another response");
            System.exit(0);
        }

        System.out.println("What is the width?: ");
        if (in.hasNextInt())
        {
            width = in.nextInt();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You must have done something wrong. \nTry another response");
            System.exit(0);
        }

        perimeter = (length * 2) + (width *2);
        diagonal = Math.sqrt((length * length) + (width * width));

        System.out.println("The Perimeter of your rectangle is " + perimeter);
        System.out.println("The diagonal of your right triangle is " + diagonal + " long");
    }
}