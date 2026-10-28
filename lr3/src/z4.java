import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class z4 {
    public static void main(String[] args) {
        String text = "a1a a12a a123a a1234a a12345a";
        Pattern pattern = Pattern.compile("a(\\d{2}){1,}a");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}