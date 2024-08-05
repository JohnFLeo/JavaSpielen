package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOMain {
    public static void main(String[] args){
        //writeToFile();
        readFromFile();

    }
    public static void writeToFile(){
        try {
            FileOutputStream outputStream = new FileOutputStream("D:\\Programmieren\\JavaProjekt\\FileIO\\Data\\testData.dat");
            outputStream.write(0xFF);
            outputStream.flush();
            outputStream.close();
        }catch (Exception e){
            System.out.println("An Error occurred during writing to file");
        }
    }
    public static void readFromFile(){
        try {
            FileInputStream inputStream = new FileInputStream("D:\\Programmieren\\JavaProjekt\\FileIO\\Data\\testData.dat");
            System.out.println( inputStream.read());
            inputStream.close();
        }catch (Exception e){
            System.out.println("An Error occurred during reading from file");
        }
    }
}
