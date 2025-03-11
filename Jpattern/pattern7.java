public class pattern7 {
    public static void main(String[] args) {
        int i;
        int n = 4;
        for (i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) {
                    System.out.print("1");

                } else {
                    System.out.print("0");
                }

            }
            System.out.println();

        }
    }
}
