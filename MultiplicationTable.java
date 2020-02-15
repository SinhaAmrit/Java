/**
* @author : Amrit Sinha
* Date : February 15,2020
* GitHub : /SinhaAmrit
* CodePen : /SinhaAmrit
* Facebook : /codiizone
* Instagram : /codiizone
* website : https://codiizone.blogspot.com/
* Java Program To Create Multiplication Table.
*/
import java.util.Scanner;
class MultiplicationTable
{
    public static void main(String args[])
    {
        int n, c;
        System.out
                .println("Enter an integer to print it's multiplication table");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        System.out.println("Multiplication table of " + n + " is :-");
        for (c = 1; c <= 10; c++)
        {
            System.out.println(n + "*" + c + " = " + (n * c));
        }
    }
}
