package Examplesystem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        //properties of system
        String username = System.getProperty("user.name");
        System.out.println("tu nombre de uusuario es: " + username);

        String home = System.getProperty("user.home");
        System.out.println("home = " + home);

        String workspace = System.getProperty("user.dir");
        System.out.println("workspace = " + workspace);

        String java = System.getProperty("java.version");
        System.out.println("java = " + java);

        Properties p = System.getProperties();
        p.list(System.out);
        // edit properties and settings of the aplication
        try {
            FileInputStream archivo = new FileInputStream("src/config.properties");
            Properties a = new Properties(System.getProperties());
            a.load(archivo);
            System.setProperties(a);
            Properties ps = System.getProperties();
            ps.list(System.out);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
