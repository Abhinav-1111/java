class cylinders{
    float height;
    float radius;

    public float volume(){
        return 3.14f * radius * radius * height;
    }

    public float surfaceArea(){
        return 2.0f * 3.14f *radius * (radius+height);
    }
}

public class CWH_Ch9_Ps_Q2 {
    public static void main(String[] args) {
        cylinders cl = new cylinders();
        cl.height = 4.0f;
        cl.radius = 5.0f;

        System.out.println("Volume of Cylinder = " + cl.volume());
        System.out.println("Volume of Surface area = " + cl.surfaceArea());
    }
}
