public class Main {
    public static void main(String[] args) {

        int rows = 5;

        for (int i = 1; i <= rows; i++) {

            // Print M
            for (int j = 1; j <= rows; j++) {
                if (j == 1 || j == rows || (i == j && i <= rows / 2 + 1) || (i + j == rows + 1 && i <= rows / 2 + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  "); 
            for (int j = 1; j <= rows; j++) {
                if (i == 1 || i == rows || j == rows / 2 + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
