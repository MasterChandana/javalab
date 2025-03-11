public class pattern6 {
    public static void main(String[] args) {
        int i;
        int n = 4;
        for (i = 1; i <= n; i++) {
            for (int sp = 1; sp <= n - i; sp++) {
                System.out.print("+");

            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
