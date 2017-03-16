import java.util.regex.Pattern;

/**
 * Created by weitaosheng on 2017/1/22.
 */
public class Main {

    public static void main(String[] args) {
        String check = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
        System.out.println(Pattern.matches(check, "245%abc@abc.com"));
    }

}
