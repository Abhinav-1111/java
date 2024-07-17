import java.util.Arrays;

public class CWH_Ch6_Ps_Q6 {
    public static void main(String[] args) {
        int[]arr = {33,44,98,55,66,77,16,88};

        // Find Maximum

        int max = 0;
        for (int i = 0; i<arr.length; i++){

            if (arr[i] >= max){
                max = arr[i];
            }
        }
        System.out.println("Maximum element is: " + max);

        int min = arr[1];

        for (int i = 0; i<arr.length; i++){

            if (arr[i] <= min){
                min = arr[i];
            }
        }
        System.out.println("Minimum element is: " + min);
    }
}
