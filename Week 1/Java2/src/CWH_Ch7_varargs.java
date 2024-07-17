public class CWH_Ch7_varargs {
//    static int sum(int a, int b){
//        return a+b;
//    }
//
//    static int sum(int a, int b, int c){
//        return a+b+c;
//    }
//
//    static int sum(int a, int b, int c, int d){
//        return a+b+c+d;
//    }

    static int sum(int x, int ...arr){
        // Available as int [] arr
            int result = x;
            for (int a: arr){
                result += a;
            }
            return result;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to varargs tutorial.");
        System.out.println("The sum of a and b is :" + sum(3));
        System.out.println("The sum of a and b is :" + sum(2,3));
        System.out.println("The sum of a, b and c is :" + sum(2,3,5));
        System.out.println("The sum of a, b, c and d is :" + sum(2,3,5,6));

    }
}
