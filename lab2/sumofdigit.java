package lab2;

public class sumofdigit {
    public static void main(String[] args) {
        int num = 143;
        int sum = 0;

        while (num > 0) {
            int rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        System.out.println("sum of digits is " + sum);

    }
}