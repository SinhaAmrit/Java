/**
* @author : Amrit Sinha
* Date : 12 February,2020
* GitHub : SinhaAmrit
* Facebook : /codiizone
* Instagram : @codiizone
* wesite : https://codiizone.blogspot.com/
* Q 3> Java Program to Accept Three Numbers And Print Largest Among Them
*/
import java.util.Scanner;
class LargestAmong{
	public static void main(String []args){
	System.out.println("Enter Three Numbers");
	Scanner kb=new Scanner(System.in);
	int a=kb.nextInt();
	int b=kb.nextInt();
	int c=kb.nextInt();
	if(a>b && a>c){
		System.out.println("Largest Number Is : "+a);
	}
	else if(b>c){
		System.out.println("Largest Numbe Is : "+b);
	}
	else{
		System.out.println("Largest Numbe Is : "+c);
	}
}
}
