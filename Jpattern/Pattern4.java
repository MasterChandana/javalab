public class Pattern4 {
    public static void main(String args[]) {
        for (int i = 1; i <= 4; i++) {
            for (int s = 1; s <= i-1; s++) {
                System.out.print(" ");
            }
            for (int j = 4; j >=i; j--) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}

