package filehandling;
import java.io.*;

public class readlinebf {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("D:\\Java Programming\\corejava\\src\\filehandling\\name1.txt"));
        String s1;
        while ((s1 = bf.readLine()) != null) {
            System.out.println(s1);
        }
        bf.close();
    }
}
