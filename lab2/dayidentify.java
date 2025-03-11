package lab2;

public class dayidentify {
    public static void main(String[] args) {
        int day = (int) (Math.random() * 7);//it is use while you want to generate random number  
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;

        
            default:
                break;
        }
    }
  

}
