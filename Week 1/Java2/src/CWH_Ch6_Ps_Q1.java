public class CWH_Ch6_Ps_Q1 {
    public static void main(String[] args) {
        float [] arr = {55.6f, 66.7f, 23.3f, 45.9f, 66.9f};
        float sum = 0;

        for (int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);

//        for (float element: arr){
//            sum = sum+element;
//        }
//        System.out.println(sum);
    }
}
