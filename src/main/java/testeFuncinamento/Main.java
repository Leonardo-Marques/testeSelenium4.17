package testeFuncinamento;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        String DIR_PATH_PROPERTIES = System.getProperty("user.dir") + File.separator + "abc.html";
        System.out.println(DIR_PATH_PROPERTIES);
    }
}