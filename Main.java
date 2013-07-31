import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] araishikeiwai) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Choose what folder to index!");
        String input = reader.readLine();
        System.out.println("Choose where to put the index file!");
        String output = reader.readLine();

        System.out.println("Starting indexing folder...");
        new DanielIndexer(input, output, reader).executeIndex();
    }
}