//Q21.Write a Java program to print a Zig-Zag pattern. 



class Main {
    public static void main(String[] args) {

        int rows = 3;
        int cols = 9;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {

                if ((i == 1 && j % 4 == 1) ||
                    (i == 2 && j % 4 == 3) ||
                    (i == 3 && j % 4 == 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
