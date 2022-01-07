import java.util.Scanner;
/**
 * Write a description of class Driver here.
 *
 * @author R. Shiroya
 * @version 02-05-2020
 */
public class Driver
{
    public static void main(String[] args)
    {
        String original = "Hello";
        String converted;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the new String: ");
        converted = keyboard.nextLine();
        
        Replacer test1 = new Replacer("Hi!");
        original = converted;
        System.out.println("The converted string is: "+ converted);
        

    }
}

