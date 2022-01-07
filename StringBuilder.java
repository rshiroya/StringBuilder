
/**
 * Write a description of class StringBuilder here.
 *
 * @author R. Shiroya
 * @version 02-05-2020
 */
public class StringBuilder
{
    public static void main(String[] args)
    {
        String state = new String ("Mississippi");
        String captitalCity = new String ("Jackson");
        String university = new String("Old Miss"); 
        System.out.println("The first letter of the state is: " + state.charAt(0));
        System.out.println("Does the State contains the substring 'pi' "+ state.indexOf("pi", 0));
        String newState=state.substring(0, 4);
        System.out.println(newState);
        String capitalState = captitalCity + ", " + state;
        System.out.println(capitalState);
        int capitalLength=captitalCity.length();
        int stateLength=state.length();
        if(stateLength > capitalLength)
        {
            System.out.println("state has more characters.");
        }
        else
        System.out.println("capital has more characters.");
    
        String stateChange=state.replace('i','o');
        System.out.println(stateChange);
        String newUniversity=university.toUpperCase();
        System.out.println(newUniversity);
        
        if(captitalCity.endsWith("son"))
        System.out.println("capital city ends with son.");
        
        char[] chars1 = state.toCharArray();
        char[] chars2 = university.toCharArray();
        
        for(int i=0;i<state.length(); i++ )
        {
        char ch=state.charAt( i );
        
        if(ch=='s')
        System.out.println("position of s : " + ( i + 1 ) );
    }
    }
    

}
