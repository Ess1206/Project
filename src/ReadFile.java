import fibonacci.Fibonacci;

import java.io.*;

/**
 * Created by Stan on 12.03.2016.
 */
public class ReadFile {


    public static void readfile(String path) throws IOException{

        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line;
        while ((line = reader.readLine()) != null){
            System.out.println(line);
        }
        reader.close();

    }
    public static void dirrect(String frame){
        File dir = new File(frame);
 

    }
}
