import java.util.Random;
import java.util.Scanner;

class game{
    int number;
    int inputNumber;
    int noOfGuesses = 0;

    game(){
        Random rd = new Random();
        this.number = rd.nextInt(100);
    }

    public void userInput(){
        System.out.println("Guess the Number: ");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
        System.out.println(inputNumber);
    }

    public boolean isCorrectNumber(){
        noOfGuesses++;
        if (inputNumber ==number){
            System.out.println("Congratulation! You guesses it right.");
            System.out.println("You guessed it right in " + noOfGuesses + " attempts.");
            return true;
        }
        else if (inputNumber < number) {
            System.out.println("Too Low.... Increase the number.");
        }
        else if (inputNumber > number) {
            System.out.println("Too high.... Decrease the number.");
        }
        return false;
    }
}

public class Exercise3 {
    public static void main(String[] args) {
        game user = new game();

        boolean b = false;

        while (!b){
            user.userInput();
            b = user.isCorrectNumber();
        }

    }
}