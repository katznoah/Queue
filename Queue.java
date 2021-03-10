import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
public class Queue{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String line;
        try(BufferedReader br = new BufferedReader(new FileReader("Queue.txt"))){
            while((line = br.readLine()) != null){
                if(!(line.equals(input))) System.out.println(line);
            }
        } catch (Exception e) { e.printStackTrace(); }
    }
}