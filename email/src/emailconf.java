import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class emailconf {
    public static void main(String[] args){
        String regexp = "^[A-z-a-z-0-9]+@[a-z]+\\.com$";
        String regexp2 = "^[A-z-a-z-0-9]+@[a-z]+\\.com$";


        // * -> tells us that zero or more
        // + -> tells us that one or more
        // {3} -> means that only 3 are allow not less or more
        // {3,6} -> bewteen 3 and 6 character should be

        Pattern pattern = Pattern.compile(regexp2);
        Matcher matcher = pattern.matcher("sanjeevshukla@gmail.com");
        if(matcher.matches()){
            System.out.println("Valid");
        }else{
            System.out.println("Not valid");
        }


    }
}
