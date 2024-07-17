public class CWH_Ch4_Conditionals {
    public static void main(String[] args) {
        String var = "Abhinav";


        switch (var){
            case "Abhinav":
                System.out.println("You are now become adult.");
                break;
            case "Akash":
                System.out.println("You are now eligible for everything.");
                break;
            case "Haneef":
                System.out.println("You are now responsible.");
                break;
            case "Rohit":
                System.out.println("You are now retired.");
                break;
            default:
                System.out.println("Enjoy your life!");
        }
        System.out.println("Hello Everyone.");

        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        switch (age){
            case 18:
                System.out.println("You are now become adult.");
                break;
            case 21:
                System.out.println("You are now eligible for everything.");
                break;
            case 40:
                System.out.println("You are now responsible.");
                break;
            case 60:
                System.out.println("You are now retired.");
                break;
            default:
                System.out.println("Enjoy your life!");
        }

        System.out.println("Hello Everyone.");
        */

        /*
        if (age>56){
            System.out.println("Your are Experienced");
        }
        else if (age > 45) {
            System.out.println("YOur sre semi-experienced");
        }
        else if (age >30) {
            System.out.println("YOu are little bit experienced");
        }
        else {
            System.out.println("You are not experienced");
        }
        */
    }
}
