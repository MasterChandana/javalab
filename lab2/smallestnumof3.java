package lab2;

public class smallestnumof3 {
    public static void main(String[] args) {
        int a=55,b=78,c=23;
        if(a<b && a<c){
            System.out.println("a is the smallest number");
        }
        else if(b<a && b<c){
            System.out.println("b is the smallest number");
        }
        else{
            System.out.println("c is the smallest number");
        }

    }
}
