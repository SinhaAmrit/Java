/**
 * 
 */
package Learning;
import java.util.Scanner;
/**
 * @author CodiiZone
 * Q.2> Java Program To Take User Input And Add Them
 */
public class AddNum {
	public static void main(String[] args) {
		System.out.println("Enter Two Numbers!");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Sum Of "+a+" And "+b+" Is : "+(a+b));
	}
}
