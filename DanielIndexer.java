import java.io.*;
import java.util.*;

public class DanielIndexer {

    private File input;
    private File output;
    private BufferedWriter writer;
    private final static String ERROR = "ERROR!";

    public DanielIndexer(String input, String output, BufferedReader reader) throws Exception {
        this.input = new File(input);
        if (!this.input.isDirectory()) {
            System.out.println(ERROR);
            System.out.println("Input is not a folder!");
            return;
        }
        
        this.output = new File(output);
        while (this.output.exists()) {
            System.out.println("Output file exists, do you want to overwrite? (Y/N)");
            String response = reader.readLine();
            if (!response.equalsIgnoreCase("Y")) {
                System.out.println("Choose another file");
                this.output = new File(reader.readLine());
            }
        }

        writer = new BufferedWriter(new FileWriter(this.output));
    }

    public void executeIndex() {

    }

    private void indexFolder(File folder) {

    }
}