 /**
* @author : Amrit Sinha
* Date : April 22,2020
* GitHub : /SinhaAmrit
* CodePen : /SinhaAmrit
* Facebook : /codiizone
* Instagram : /codiizone
* website : https://codiizone.blogspot.com/
* Java Program For Alphabet Pattern
 

A 
BB 
CCC
DDDD
EEEEE 
*/

import java.util.*;

class AlphabetPattern
{
    public static void main(String[] arg)
    {
        int line, row, col;
        char ch = 'A';
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of lines : ");
        line = scanner.nextInt();

        for (row = 1; row <= line; row++)
        {
            for (col = 1; col <= row; col++)
            {
                System.out.print("" + ch);
            }
            System.out.println();
            ch++;
        }
    }
}
