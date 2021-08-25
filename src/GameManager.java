import java.io.FileNotFoundException;

public class GameManager {


    public static void main(String[] args) throws FileNotFoundException {
        String selectedMovie = Reader.ReadAndScanFile();
        char[] movieName = selectedMovie.toCharArray();

        UserInterface.GameLoop(movieName);
    }

}
