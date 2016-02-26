// package src;
// import src.WordCount;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WcUtil {
    private String file;

    public WcUtil(String file) {
        this.file = file;
    }

    public String getContent() {
        String chunk = "";
        try {
            FileReader fileName = new FileReader(file);
            BufferedReader br = new BufferedReader(fileName);
            String line = br.readLine();
            while (line != null) {
                chunk += line + "\n";
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.toString().split(":")[1]);
        } catch (IOException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        return chunk;
    }

    ;
}
