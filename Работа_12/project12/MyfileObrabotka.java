package project12;

import java.io.*;
import java.nio.charset.StandardCharsets;
public class MyfileObrabotka {
    FileInputStream fileIn = null;
    FileOutputStream fileOut = null;
    public MyfileObrabotka(String input,String output) throws
            FileNotFoundException {
        fileIn = new FileInputStream(input);
        fileOut = new FileOutputStream(output);
    }
    public void transport() throws IOException {
        int a;
        while ((a = fileIn.read()) != -1) {
            String b=org.apache.commons.codec.digest.DigestUtils.sha256Hex(fileIn);
            fileOut.write(b.getBytes(StandardCharsets.UTF_8));
        }
        if (fileIn != null) {
            try {
                fileIn.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
        if (fileOut != null) {
            try {
                fileOut.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }
    public void deletik(String in){
        new File(in).delete();
    }
}