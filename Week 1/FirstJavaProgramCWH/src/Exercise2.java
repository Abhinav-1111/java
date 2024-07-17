import java.util.Scanner;
import java.util.Random;

public class Exercise2 {
    public static void main(String[] args) {
        int Rock =1;
        int Paper =2;
        int Scissor =3;

        int randS = 0;
        int userS = 0;

        int i=0;
        while (i<3){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number, 1 for Rock, 2 for Paper, 3 for Scissor : ");
            int number = sc.nextInt();
            System.out.println(number);

            Random rand = new Random();
            int rand1 = rand.nextInt(1, 3);
            System.out.println("Robot = " + rand1);

            if (number == 1 && rand1 ==2){
                randS +=1;
                System.out.println("Robot got 1 Points");
            }
            else if(number == 2 && rand1 ==1){
                userS +=1;
                System.out.println("You got 1 Points");
            }
            else if (number == 1 && rand1 ==3){
                userS +=1;
                System.out.println("You got 1 Points");
            }
            else if(number == 3 && rand1 ==1){
                randS +=1;
                System.out.println("Robot got 1 Points");
            }
            else if (number == 2 && rand1 ==3){
                randS +=1;
                System.out.println("Robot got 1 Points");
            }
            else if(number == 3 && rand1 ==2){
                userS +=1;
                System.out.println("You got 1 Points");
            }
            else{
                System.out.println("Draw");
            }
            i++;
        }

        System.out.println("Computer Points = " + randS);
        System.out.println("User Points = " +userS);

        if (randS > userS){
            System.out.println("Robot Win");
        }
        else if (randS == userS){
            System.out.println("Draw");
        }
        else {
            System.out.println("You Win");
        }

    }
}
