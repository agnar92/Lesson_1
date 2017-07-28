/**
 * Created by KomputerK on 29.06.2017.
 */
import java.util.regex.*;
public class codewars {
    public static  howOld(final String herOld) {
        Pattern p = Pattern.compile("[0-9]");
        Matcher m = p.matcher(herOld);
        while(m.find()){
            int numb = Integer.parseInt(m.group());
            return numb;
        }
        return 0;
    }
}
