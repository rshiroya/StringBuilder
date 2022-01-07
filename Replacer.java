
/**
 * Write a description of class Replacer here.
 *
 * @author R.Shiroya
 * @version 02-05-2020
 */

public class Replacer
{
    String original;
    StringBuilder converted;
    public Replacer(String rep)
    {
        original = new String(rep);
        converted = new StringBuilder(rep);
    }

    public void replace(String toReplace, String str)
    {
        for(int i = 0; i < original.length() - toReplace.length(); i++)
        {
            if(original.substring(i, i + toReplace.length()).equals(toReplace))
            {
                converted.replace(i, i + toReplace.length(), str);
            }
        }
    }
    public void setString(String rep)
    {
        converted.append(rep);
        
        original = rep;
    }
     public String getOriginal()
    {
        return original;
    }

    public String getConverted()
    {
        return converted.toString();
    }

    

}

