public class pattern5 {

    public static void main(String[] args) {
        int i;
        int n = 4;
        for (i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.err.print("*");

                } else {
                    System.err.print(" ");
                }
            }
            System.err.println();
        }

    }
}
