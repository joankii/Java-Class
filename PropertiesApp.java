package Program.Classes;
import java.io.*;
import java.util.Properties;
public class PropertiesApp {

    public static void main(String[] args) {

        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("application.properties"));

            String host = properties.getProperty("database.host");
            String port = properties.getProperty("database.port");
            String username = properties.getProperty("database.username");
            String password = properties.getProperty("database.password");

            System.out.println(host);
            System.out.println(port);
            System.out.println(username);
            System.out.println(password);

        } catch (FileNotFoundException exception) {
            System.out.println("File tidak ketemu");
        } catch (IOException exception) {
            System.out.println("Gagal load data dari file");
        }


        try {
            Properties properties = new Properties();
            properties.put("name.first", "Jo");
            properties.put("name.middle", "An");
            properties.put("name.last", "Kii");

            properties.store(new FileOutputStream("name.properties"), "Konfigurasi Nama");
        } catch (FileNotFoundException exception) {
            System.out.println("Error membuat file properties");
        } catch (IOException exception) {
            System.out.println("Error menyimpan properties");
        }

    }
}
