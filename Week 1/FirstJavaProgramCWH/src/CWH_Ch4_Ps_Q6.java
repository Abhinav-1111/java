import java.util.Scanner;

public class CWH_Ch4_Ps_Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the url");
        String website = sc.next();

        if (website.endsWith(".com")){
            System.out.println(" This is a Commercial Website");
        }
        else if (website.endsWith(".org")){
            System.out.println("This is an Organisational Website");
        }
        else if (website.endsWith(".in")){
            System.out.println("This is an Indian Website");
        }
    }
}
