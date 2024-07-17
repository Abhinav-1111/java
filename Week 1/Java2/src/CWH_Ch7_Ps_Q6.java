public class CWH_Ch7_Ps_Q6 {
    static float average(float n1, float n2, float n3, float n4, float n5){
        float sum = n1+n2+n3+n4+n5;

        return (sum *100)/500;
    }

    public static void main(String[] args) {
        float a = average(71.0f,71.0f,65.0f,63.0f,78.0f);
        System.out.println(a);
    }
}
