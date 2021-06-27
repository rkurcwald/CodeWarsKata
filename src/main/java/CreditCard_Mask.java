import java.util.Arrays;
public class CreditCard_Mask
{
    public static String maskify(String str)
    {
        if(str.length()<4)
        {
            return str;
        }
        else
        {
            char[] ch=str.toCharArray();
            Arrays.fill(ch,0,ch.length-4,'#');
            return new String(ch);
        }
    }
}
