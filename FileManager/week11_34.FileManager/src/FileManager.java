
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {

    public List<String> read(String file) throws FileNotFoundException {
        File k = new File(file);
        Scanner reader = new Scanner(k); 
        List<String> toRead = new ArrayList<String>();
        while(reader.hasNextLine()) {
            String line = reader.nextLine();
            toRead.add(line);
        }
        return toRead;
    }

    public void save(String file, String text) throws IOException {
        FileWriter writer = new FileWriter(file);
        writer.write(text);
        writer.close();        
    }

    public void save(String file, List<String> texts) throws IOException {
        FileWriter toWrite = new FileWriter(file);
        for(String words: texts) {
            toWrite.write(words + "\n");
        }
        toWrite.close();
    }
}
