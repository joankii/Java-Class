package Program.Classes;

public class StringApp {
    public static void main(String[] args) {

        String name = "Joankii";
        String nameLowercase = name.toLowerCase();
        String nameUppercase = name.toUpperCase();

        System.out.println(name);
        System.out.println(nameLowercase);
        System.out.println(nameUppercase);
        System.out.println(name.length());
        System.out.println(name.startsWith("Joan"));
        System.out.println(name.endsWith("kii"));

        String[] names = name.split(" ");
        for (var value : names) {
            System.out.println(value);
}
        System.out.println(" ".isBlank());
        System.out.println(" ".isEmpty());
    }
}
