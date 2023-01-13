package Program.Classes;
import java.util.*;
public class StringTokenizerApp {
    public static void main(String[] args) {

        String value = "Jo an kii";

        StringTokenizer tokenizer = new StringTokenizer(value, " ");

        while(tokenizer.hasMoreTokens()){
            String result = tokenizer.nextToken();
            System.out.println(result);

        }


    }
}
