public class CWH_Ch7_Ps_Q3 {
//    static int add(int n){
//        int sum = 0;
//        for (int i=0; i<=n; i++){
//            sum +=i;
//        }
//        return sum;
//    }

    static int add(int n){
        if (n==1){
            return 1;
        }
        return n+add(n-1);
    }

    public static void main(String[] args) {
//        int a =add(5);
//        System.out.println(a);

        int a =add(5);
        System.out.println(a);
    }
}
