import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hangman {

    public static void main(String[] args){
        int guessesLeft = 4;
        String word;
        String guess;
        String guessedWord;
        Scanner scan = new Scanner(System.in);
        System.out.println("------- Welcome to Hangman -------");
        System.out.print("\nEnter a word: ");
        word = scan.nextLine().toUpperCase();
        int action = 0;
        boolean won = false;

        int[] guessedLetters = new int[word.length()];
        initGuessedLetter(word, guessedLetters);


        while(!won && guessesLeft > 0){
            System.out.print("So far, the word is: ");
            printWord(guessedLetters, word, false);
            System.out.println("You have " + guessesLeft + " incorrect guesses left.");
            action = 0;
            while(action != 1 && action != 2) {
                System.out.print("Enter either 1 for guessing or 2 for hint: ");
                try {
                    action = Integer.parseInt(scan.nextLine());
                }catch (Exception e){
                    System.out.println("You have to type either 1 or 2.");
                    action = 0;
                }
            }

            if(action == 1){
                System.out.print("Enter your guess: ");
                guess = scan.nextLine().toUpperCase();
                if(isGuessCorrect(guess, word, guessedLetters)){
                    System.out.println("That's right! " + guess + " is in the word.");
                }
                else {
                    System.out.println("Sorry, " + guess + " isn't in the word;");
                    guessesLeft--;
                }

            }
            else {
                System.out.println("OK! The hint is " + getHint(word, guessedLetters));
                guessesLeft--;
                System.out.println("But since you used the hint, you can guess " + guessesLeft + " more times.");
            }

            won = hasWon(guessedLetters);
            System.out.print("\n");
        }

        if(won){
            System.out.print("Congratulations! The word was ");
            printWord(guessedLetters, word, true);

        }
        else{
            System.out.println("You failed. The word was ");
            printWord(guessedLetters, word, true);
        }

    }

    private static void initGuessedLetter(String word, int[] guessedLetters){
        for(int i = 0; i < word.length(); i++){
            guessedLetters[i] = word.charAt(i) == ' '? 2 : 0;
        }
    }

    private static void printWord(int[] guessedLetters, String word, boolean reveal){
        for(int i = 0; i < word.length(); i++){
            switch (guessedLetters[i]) {
                case 0:
                    if(reveal){
                        System.out.print(word.charAt(i));
                    }else {
                        System.out.print('_');
                    }
                    break;
                case 1:
                    System.out.print(word.charAt(i));
                    break;
                case 2:
                    System.out.print('#');
                    break;
            }

            System.out.print(" ");
        }
        System.out.print("\n");
    }

    private static char getHint(String word, int[] guessedLetters){
        for(int i = 0; i < word.length(); i++){
            if(guessedLetters[i] == 0){
                return word.charAt(i);
            }
        }
        return 0;
    }

    private static boolean hasWon(int[] guessedLetters){
        for(int state: guessedLetters){
            if(state == 0){
                return false;
            }
        }
        return true;
    }

    private static boolean isGuessCorrect(String guess, String word, int[] guessedLetters){
        boolean correct = false;
        for(int i = 0; i < word.length(); i++){
            if(guess.charAt(0) == word.charAt(i)){
                correct = true;
                guessedLetters[i] = 1;
            }
        }
        return correct;
    }
}
