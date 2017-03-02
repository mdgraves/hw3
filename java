
/**
 * This class calculates the product of odd numbers within a user specified range.
 * @(Marcus Graves) 
 */
import java.util.Scanner;
public class Calculate
{
    // instance variables 
    private int product = 1;
    private int low;
    private int hi;
    private int temp;
    public void Numbers()
    {
        System.out.print("This program finds the product of odd numbers within a range that is specified by you. Enjoy!\n");
        System.out.print("Enter the low number: "); 
        Scanner input = new Scanner(System.in);
        low = input.nextInt();
        System.out.print("Now enter the hi number: ");
        hi = input.nextInt();
        //Checks to see if numbers are even then increments or decrements accordingly.
        if((low%2) == 0)
        {
            low = low +1;
        }
        else if((hi%2) == 0)
        {
            hi = hi -1;
        }
        //validate high and low numbers. Swaps the values of input if user enters high number first.
        else if(low>hi)
        {
            temp = low;
            low = hi;
            hi = temp;
        }
        //Calculates the products of all odd numbers within the range.
        for(int i = low; i<=hi; i+=2)
        {
            product*= i;
        }
        System.out.print(product);
    }
}
