public class CWH_Ch5_break_and_continue {
    public static void main(String[] args) {
//        for (int i=0; i<=10; i++){
//            System.out.println("The number is : " + i);
//            if (i==5){
//                System.out.println("we can't process.");
//                break;
//            }
//        }

//        int i =0;
//        while (i<=5){
//            System.out.println("The number is : " + i);
//            if (i==2){
//                System.out.println("we can't process.");
//                break;
//            }
//            i++;
//        }

        for (int i = 0; i<=5; i++){

            if (i==2){
                System.out.println("we can't process.");
                continue;
            }
            System.out.println("The number is : " + i);
        }
    }
}
