import java.io.*;

public class SearchUtils {

    int numberOfFiles;
    File currentFile;


    FileReader input = new FileReader("myFile");
    BufferedReader bufRead = new BufferedReader(input);
    String myLine = null;



    public SearchUtils() throws IOException {
        while ( (myLine = bufRead.readLine()) != null)){
            String[] array1 = myLine.split(":");
    }
}
