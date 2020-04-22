 /**
* @author : Amrit Sinha
* Date : April 22,2020
* GitHub : /SinhaAmrit
* CodePen : /SinhaAmrit
* Facebook : /codiizone
* Instagram : /codiizone
* website : https://codiizone.blogspot.com/
* Java Program For Christmas tree - 2 
   X
   X
  XXX
   X
 XXXXX
   X
  XXX
XXXXXX 

*/
class ChristmasTreePattern
{
    public static void main(String[] arg)
    {
        drawChristmasTree(4);
    }

    private static void drawChristmasTree(int n)
    {
        for (int i = 0; i < n; i++)
        {
            triangle(i + 1, n);
        }
    }

    private static void triangle(int n, int max)
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < max - i - 1; j++)
            {
                System.out.print(" ");
            }

            for (int j = 0; j < i * 2 + 1; j++)
            {
                System.out.print("X");
            }

            System.out.println("");
        }
    }
}
