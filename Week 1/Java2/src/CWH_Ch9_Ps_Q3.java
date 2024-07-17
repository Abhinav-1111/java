class Cylinderr{
    private int height;
    private int radius;

    Cylinderr(int h, int r){
        height = h;
        radius = r;
    }

    public int getRadius(){
        return radius;
    }
    public int getHeight(){
        return height;
    }
}


public class CWH_Ch9_Ps_Q3 {
    public static void main(String[] args) {
        Cylinderr cl = new Cylinderr(4,5);

        System.out.println("Height = " + cl.getHeight());
        System.out.println("Radius = " + cl.getRadius());
    }
}
