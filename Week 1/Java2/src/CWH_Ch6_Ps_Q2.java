public class CWH_Ch6_Ps_Q2 {
    public static void main(String[] args) {
        int[]arr = {33,44,55,66,77};
        int num = 55;
        boolean  isInArray = false;
        for (int element: arr){
            if (num == element){
                isInArray = true;
                break;
            }
        }

        if (isInArray){
            System.out.println("The element is present in array.");
        }
        else {
            System.out.println("The element is not present in array");
        }
    }
}
