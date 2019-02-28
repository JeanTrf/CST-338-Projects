import java.io.*;
import java.util.Scanner;

public class FileReader {
    /**
     * author: Jean Troffer-Charlier
     * date: 02/07/19
     * Description: FileReader class written in class to discover the file reading system in Java.
     */
    public static void main(String[] args){
        String filename = "myFile.txt";
        Scanner scan = null;
        File f = new File(filename);

        try {
            if(f.createNewFile()){
                System.out.println(filename + " created successfully");
            }
            else{
                System.out.println(filename + " already exists.");
            }
            scan = new Scanner(f);
        }
        catch(FileNotFoundException e){
            System.out.println("Couldn't find the file... even though we are making it. " + e);
            e.printStackTrace();
        }
        catch (IOException e){
            System.out.println("Problem when making file... " + e);
            e.printStackTrace();
        }

        while(scan != null && scan.hasNext()){
            String input = scan.nextLine();
            System.out.println(input + " :");
            FileReader.listing(input);

        }
    }

    private static void listing(String input){
        String[] parts = input.split(",");
        for (String part: parts) {
            System.out.println(part.trim());
        }
    }
}
