package Program.Classes;

public class StringBufferApp {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("hello "); // now original string is changed
        sb.append("Joan");
        System.out.println(sb);
    }
}
