public class CWH_Ch6_Ps_Q7 {
    public static void main(String[] args) {
        //int[]arr = {33,44,98,55,66,77,16,88};
        int[]arr = {33,44,55,66,77,88};
        boolean sorted = true;
        for (int i=0; i<arr.length-1; i++){
            if (arr[i] > arr[i+1]){
                sorted = false;
                break;
            }
        }

        if (sorted){
            System.out.println("Array is Sorted");
        }
        else{
            System.out.println("Array is Not sorted");
        }
    }
}
