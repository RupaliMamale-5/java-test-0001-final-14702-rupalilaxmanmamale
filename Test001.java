public class Pattern {
    public static void main(String[] args) {

        int n = 4;

        // Upper part
        for (int i = 1; i <= n; i++) {

            // Left spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // Left star
            System.out.print("*");

            // Middle spaces
            for (int j = 1; j < 2 * i - 1; j++) {
                System.out.print(" ");
            }

            // Right star (except first row)
            if (i != 1) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower part
        for (int i = n - 1; i >= 1; i--) {

            // Left spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            // Left star
            System.out.print("*");

            // Middle spaces
            for (int j = 1; j < 2 * i - 1; j++) {
                System.out.print(" ");
            }

            // Right star (except first row)
            if (i != 1) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}