import java.util.Scanner;

public class CWH_Ch4_Ps_Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the income in lacs: ");
        float income = sc.nextFloat();
        float tax = 0;


        if (income <= 2.5f){
            tax = tax + 0;
        }
        else if (income > 2.5f && income <= 5.0f){
            tax = (tax + ((income - 2.5f) * 0.05f ));
        }
        else if (income > 5.0f && income <=10.0f){
            tax = (tax + ((5 - 2.5f) * 0.05f));
            tax = (tax + ((income - 5f) * 0.2f));
        }
        else if(income >10.0f){
            tax = (tax + ((5 - 2.5f) * 0.05f));
            tax = (tax + ((10 - 5f) * 0.2f));
            tax = (tax + ((income - 10f) * 0.3f));
        }

        System.out.println("The total tax paid by the employee is : " + tax);
    }
}
