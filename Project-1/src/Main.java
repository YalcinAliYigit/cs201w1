// Java Program to illustrate
// reading from Text File
// using Scanner Class
import java.io.*;
import java.util.Scanner;

    public class Main{
    public static void main(String[] args) throws Exception
    {

        File file = new File("C:\\Users\\ay021692\\IdeaProjects\\Project-1\\src\\input.txt");
        Scanner scanner = new Scanner(file);
        FileWriter writer = new FileWriter("C:\\Users\\ay021692\\IdeaProjects\\Project-1\\src\\input.txt");

        while (scanner.hasNextLine())

            System.out.println(scanner.nextLine());
    }
}
