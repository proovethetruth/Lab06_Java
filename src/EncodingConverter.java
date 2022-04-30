
import java.io.*;

public class EncodingConverter {
    public void encodingConverter(String inputFile, String outputFile, String firstEncoding, String secondEncoding) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader
                                (new FileInputStream(inputFile), firstEncoding));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter
                                (new FileOutputStream(outputFile), secondEncoding));
            String line;
            while((line = bufferedReader.readLine()) != null){
                bufferedWriter.write(line);
                bufferedWriter.flush();
            }
            bufferedReader.close();
            bufferedWriter.close();
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}