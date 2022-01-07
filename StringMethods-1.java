
/**
 * This class contains a main( ) method only
 * and its purpose it to demonstrate the use
 * of several methods in the String class API
 * 
 * Each student must submit their completed code.
 * 
 * @author R.Shiroya 
 * @version 02-04-2020
 */
public class StringMethods
{
    public static void main(String[ ] args)
    {
        String sentence;
        int count;
        
        sentence = new String("The Mississippi originates in Minnesota and flows to Louisiana.");
        System.out.println("The number of characters in the sentence " + sentence + "is "+ sentence.length());
        
        System.out.println("Does the sentence contain the string 'nat' ? " + sentence.contains("nat"));
        
        System.out.println("Does the sentence contain the string 'beat' ?" + sentence.contains("beat"));
        
        if(sentence.endsWith("ana"))
        System.out.println("The sentence ends with 'ana'");
        
        if(sentence.endsWith("ana."))
        System.out.println("The sentence ends with 'ana.'");

        System.out.println("The first occurance of s is: " + sentence.indexOf('s'));
        
        System.out.println("The second occurance of 's' is: " + sentence.indexOf("s", sentence.indexOf("s") + 1));
        
        System.out.println("The third occurance of 's' is: " + sentence.indexOf("s", sentence.indexOf("s") + 2));
        
        System.out.println("The last occurance of 's' is: " + sentence.lastIndexOf("s"));
        
        System.out.println("The first occurance of is starts from the character: " + sentence.indexOf("is"));
        
        System.out.println("The last occurance of 'is' starts from: " + sentence.lastIndexOf("is"));
        
        String sentenceChange = sentence.replace('s', 'z');
        System.out.println(sentenceChange);
        
        String newSentence = sentence.substring(3, 9);
        System.out.println(newSentence);
        
        String upperCaseSentence = sentence.toUpperCase();
        System.out.println(upperCaseSentence);
        
      //todo using the String class API methods
      /* 1) Does the sentence contain the string "nat" ?
       * 2) Does the sentence contain the string "beat" ?
       * 3) Does the sentence end with "ana"?
       * 4) Does the sentence end with "ana."?
       * 5) Where is the first occurance of 's' ?
       * 6) Where is the second occurance of 's'?
       * 7) Where is the third occurance of 's'?
       * 8) Where is the last occurace of 's'?
       * 9) Where does the  first occurance of "is" start?
       * 10)Where does the last occurance of "is" start"?
       * 11)Replace each occurance of 's' with 'z'.
       * 12) Does step 11 change the original sentence, prove it by printing.
       * 13) Print the substring of the sentence beginning at character 3 for 6 characters"
       * 14) Print the entire sentence in upper case.
       * 15) Does step 13 change the original string, prove it by printing
       */
     }
}
