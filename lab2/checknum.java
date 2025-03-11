package lab2;

public class checknum {
    public static void main(String[] args) {
        
        System.out.println("input your number");
        int num= 5;
        if(num>0){
            System.out.println("positive number");
            if(num%2==0){
                System.out.println("even number");
            }
            else{
                System.out.println("odd number");
            }
        }
        else if(num<0){
            System.out.println("negative number");
            if(num%2==0){
                System.out.println("even number");
            }
            else{
                System.out.println("odd number");
            }
        }
        else{
            System.out.println("zero");
        }
    }
    
}
