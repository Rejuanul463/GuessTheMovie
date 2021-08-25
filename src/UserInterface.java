import java.util.Scanner;

public class UserInterface {

    public static void GameLoop(char[] movieTitle)
    {
        char userInput = '0';
        boolean winOrLoss = false;
        int wrongGuess = 0;
        char[] wrongGuesses = new char[20];
        char[] inputedName = new char[movieTitle.length];
        int countRightGuess = 0;
        int countMatch = 0;
        int countSpace = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("You are guessing:");
        for(int i = 0; i < movieTitle.length; i++)
        {
            if(movieTitle[i] != ' ')
            {
                inputedName[i] = '_';
            }
            else
            {
                inputedName[i] = ' ';
                countSpace++;
            }
            System.out.print(inputedName[i]);
        }
        System.out.print("\n");

        while(!winOrLoss)
        {

            System.out.print("You have guessed (" + wrongGuess + ") wrong letters:");
            for(int i = 0; wrongGuesses[i] != '\0' ; i++){
                System.out.print(wrongGuesses[i] + " ");
            }
            System.out.print("\n");

            System.out.print("Guess a letter :");



            userInput = scan.next().charAt(0);

            for(int i = 0; i < movieTitle.length; i++) {
                if(userInput == movieTitle[i]){
                    if(inputedName[i] != movieTitle[i])
                        countMatch++;
                    inputedName[i] = movieTitle[i];

                }
            }
            if(countMatch == 0)
            {
                wrongGuesses[wrongGuess] = userInput;
                wrongGuess++;
            }
            else
            {
                countRightGuess += countMatch;
            }

            if(wrongGuess >= 10)
            {
                System.out.println("You have Lost");
                break;
            }
            if(countRightGuess + countSpace == movieTitle.length)
            {
                System.out.println("You win!");
                System.out.println("You have guessed '" + String.valueOf(movieTitle) + "' correctly");
                break;
            }

            System.out.print("You are guessing:");
            countMatch = 0;
            for(int i = 0; i < movieTitle.length; i++)
            {
                System.out.print(inputedName[i]);
            }
            System.out.print("\n");
        }
    }
}
