class cylinder{
    private int height;
    private int radius;

    public int getHeight(){
        return height;
    }
    public void setHeight(int h){
        height = h;
    }

    public int getRadius(){
        return radius;
    }
    public void setRadius(int r){
        radius = r;
    }
}

public class CWH_Ch9_Ps_Q1 {
    public static void main(String[] args) {
        cylinder cl = new cylinder();

        cl.setHeight(4);
        cl.setRadius(5);

        System.out.println("Radius = " + cl.getRadius());
        System.out.println("Height = " + cl.getHeight());
    }
}
