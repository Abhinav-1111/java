public class CWH_Ch6_Ps_Q5 {
    public static void main(String[] args) {
        int[]arr = {33,44,55,66,77};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;
        for (int i = 0; i<n; i++){
            temp = arr[i];
            arr[i]= arr[l-1-i];
            arr[l-1-i] = temp;

        }
        for (int element : arr){
            System.out.println(element);
        }
    }
}
