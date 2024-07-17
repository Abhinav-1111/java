// write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade.

public class CWH_Ch2_Ps_Qs2 {
    public static void main(String[] args) {

        System.out.println("Enter a grade");
        char grade = 'B';
        grade += 8;
        System.out.println("Grade = " + grade);

        // Decrypt the code
        grade -= 8;
        System.out.println("Grade = " + grade);
    }
}
