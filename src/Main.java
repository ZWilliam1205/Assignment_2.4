import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.io.File;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        File illiad = new File("illiad.txt");
        Scanner scanner = new Scanner(illiad);
        Set Wordlist = new HashSet();

        while (scanner.hasNext()) {
            String word = scanner.next();
            word = word.toLowerCase();
            String cleanWord = word.replaceAll("\\p{P}", "");
            Wordlist.add(cleanWord);
        }
        System.out.println(Wordlist.size());
    }
}