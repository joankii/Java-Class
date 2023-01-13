package Program.Classes;
import java.util.*;
public class StringJoinerApp {
    public static void main(String[] args) {

        StringJoiner joiner = new StringJoiner(",","[","]");

        joiner.add("Hello");
        joiner.add("Joan");
        joiner.add("Kii");


        String value = joiner.toString();
        System.out.println(value);


    }
}
