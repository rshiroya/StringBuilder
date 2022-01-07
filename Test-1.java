import java.util.Scanner;
/**
 * Write a description of class Test here.
 *
 * @author R. Shiroya
 * @version 02-05-2020
 */
public class Test
{

    public static void main(String[] args) 
    {
    
         
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Write a sentence: ");
        String str = keyboard.nextLine();
        System.out.println("The number of characters the sentence contains isx: "+str.length());
        
        System.out.println("The first letter of the sentence: " + str.charAt(0));
        System.out.println("The last letter of the sentence: " + str.charAt(str.length()-1));
        
        boolean letter_e = str.contains("e");
        System.out.println("Does the sentence contains letter 'e'? " + letter_e);
        
        boolean letters_ey =  str.contains("ay");
        System.out.println("Does the sentence contains the letters 'ay'? " + letters_ey);
        
        int e_length = str.length() - str.replace("e", "").length();
        System.out.println("the number of times e is repeated is: " + e_length);
        
        System.out.println("The position of last occurence of e: "+str.lastIndexOf('e'));
        
        int e_first=str.indexOf('e');
        System.out.println(" The second occurence of letter e: "+str.indexOf('e', e_first + 1));
        
        int spaces_count = str.length() - str.replace(" ","").length();
        System.out.println("characters your sentence contains besides the space character: "+ spaces_count);
        
        System.out.println(str+" you know");
        System.out.println("uppercase version: "+str.toUpperCase());
        
        System.out.println("Print a substring of five characters from the sentence: "+str.substring(0, 5));
        
        String aTox=str.replace('a','x');
        System.out.println(" Print a String where all the chars 'a' are replaced with the char 'x': "+ aTox);
    }

}

