/**
* @author : Amrit Sinha
* Date : February 15,2020
* GitHub : /SinhaAmrit
* CodePen : /SinhaAmrit
* Facebook : /codiizone
* Instagram : /codiizone
* website : https://codiizone.blogspot.com/
* Java Program To Calculate Mean.
*/
import java.util.Scanner;
class CalculateMean
{
    public static void main(String[] args)
    {
        int sum = 0, inputNum;
        int counter;
        float mean;
        Scanner NumScanner = new Scanner(System.in);
        System.out.println("Enter the total number of terms whose mean you want to calculate");
        counter = NumScanner.nextInt();
        System.out.println("Please enter " + counter + " numbers:");
        for (int x = 1; x <= counter; x++)
        {
            inputNum = NumScanner.nextInt();
            sum = sum + inputNum;     
        }
        mean = sum / counter;
        System.out.println("The mean of the " + counter + " numbers you entered is " + mean);
    }
}
