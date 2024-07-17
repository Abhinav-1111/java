public class CWH_Ch7_Ps_Q7 {
    static float celsius(float n){

        float formula = ((n * 9)/5) + 32 ;

        return formula;
    }

    public static void main(String[] args) {
        float a = celsius(45.6f);
        System.out.println(a);

    }
}
