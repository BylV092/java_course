package Examplesystem;

import java.io.IOException;

public class rt {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        Process p;
        try {
            if (System.getProperty("os.name").startsWith("Windows")) {
                p = rt.exec("explorer");
            } else {
                p = rt.exec("");
            }
            p.waitFor();
        } catch (Exception e) {
            System.err.println("El comado es erroneo");
        }
        System.out.println("Se ha cerrado el editor con exito");
        System.exit(0);
    }
}
