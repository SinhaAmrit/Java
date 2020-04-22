 /**
* @author : Amrit Sinha
* Date : April 22,2020
* GitHub : /SinhaAmrit
* CodePen : /SinhaAmrit
* Facebook : /codiizone
* Instagram : /codiizone
* website : https://codiizone.blogspot.com/
* Java Program For Binary Pattern
1
01
101
0101
10101 
*/
class BinaryPattern
{
    public static void main(String s[])
    {
        int i, j;
        int count = 1;
        for (i = 1; i <= 5; i++)
        {
            for (j = 1; j <= i; j++)
            {
                System.out.format("%d", count++ % 2);
                if (j == i && i != 5)
                    System.out.println("");
            }

            if (i % 2 == 0)
                count = 1;
            else
                count = 0;
        }
    }
}
