import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValuesDrive {
    public static void main(String[] args) throws IOException {
        Properties prop=new Properties();
        FileInputStream file=new FileInputStream("/home/akshiy/IdeaProjects/Introduction/src/main/java/data.properties");
        prop.load(file);
        System.out.println(prop.getProperty("browser"));
        System.out.println(prop.getProperty("url"));
        prop.setProperty("browser","chrome");
        System.out.println(prop.getProperty("browser"));
        FileOutputStream file1=new FileOutputStream("/home/akshiy/IdeaProjects/Introduction/src/main/java/data.properties");
        prop.store(file1,null);


    }
}
