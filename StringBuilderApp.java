package Program.Classes;
import java.lang.*;

public class StringBuilderApp {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();
        builder.append("Joankii");
        builder.append(" ");
        builder.append("How ");
        builder.append("Are ");
        builder.append("You?");

        String name = builder.toString();
        System.out.println("String = " + builder.toString());


    // Create a StringBuilder object
    // using StringBuilder() constructor

    StringBuilder str = new StringBuilder();

        str.append("Hello");

    // print string
        System.out.println("String = " + str.toString());

    // create a StringBuilder object
    // using StringBuilder(CharSequence) constructor
    StringBuilder str1
            = new StringBuilder("Joankii");

    // print string
        System.out.println("String1 = " + str1.toString());

    // create a StringBuilder object
    // using StringBuilder(capacity) constructor
    StringBuilder str2 = new StringBuilder(10);

    // print string
        System.out.println("String2 capacity = "
                + str2.capacity());

    // create a StringBuilder object
    // using StringBuilder(String) constructor
    StringBuilder str3
            = new StringBuilder(str1.toString());

    // print string
        System.out.println("String3 = " + str3.toString());

}

}
