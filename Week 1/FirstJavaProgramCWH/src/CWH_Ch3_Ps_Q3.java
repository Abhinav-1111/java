/*
    Q3. Write a java program to fill in a letter template which looks like below:
    letter = "Dear <|name|>, Thanks a lot"
    Replace <|name|> with a string(some name)
 */

public class CWH_Ch3_Ps_Q3 {
    public static void main(String[] args) {
        String letter = "Dear <|name|>, Thanks a lot";
        letter = letter.replace("<|name|>", "Abhinav");
        System.out.println(letter);
    }
}
