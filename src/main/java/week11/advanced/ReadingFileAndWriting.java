package week11.advanced;

import java.io.*;

public class ReadingFileAndWriting {

    public static void main(String[] args) {
        try {
            // input
            File fileToRead = new File("/Users/gokhanpolat/Developer/summary/file1.txt");
            FileReader fileReader = new FileReader(fileToRead);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();

            // output
            File fileToWrite = new File("/Users/gokhanpolat/Developer/summary/file2.txt");
            FileWriter fileWriter = new FileWriter(fileToWrite);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            while (line != null) {
                printWriter.println(line);
                line = bufferedReader.readLine();
            }

            printWriter.close();
            bufferedReader.close();
            fileReader.close();
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
