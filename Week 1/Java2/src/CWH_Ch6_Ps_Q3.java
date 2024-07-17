public class CWH_Ch6_Ps_Q3 {
    public static void main(String[] args) {
        int[]arr = {33,44,55,66,77};
        int sum = 0;
        for (int element: arr){
            sum = sum + element;
        }
        int avg = sum/arr.length;
        System.out.println("Sum = " + sum);
        System.out.println("Avg = " + avg);
    }
}
