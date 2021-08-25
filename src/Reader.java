import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Reader {
    public static String array[] = new String[100];

    static String ReadAndScanFile() throws FileNotFoundException {
        File file = new File("MovieTitles.txt");
        Scanner scan = new Scanner(file);
        int i = 0;
        while(scan.hasNextLine()) {
            array[i] = scan.nextLine();
            i += 1;
        }
        int indexNumber = TakeRandomIndex(i);

        return array[indexNumber];
    }

    static int TakeRandomIndex(int range){
        Random dice = new Random();
        int number = dice.nextInt(range);
        return number;
    }
}
