public class pattern5 {
    public static void main(String[] args) {
        pattern11(4);
    }
    static void pattern11(int n) {
        for (int row = 1; row <=n; row++) {
            for (int space = 0;space<n-row;space++) {
                System.out.print(" ");
            }
            for (int col = row;col>=1;col--) {
                System.out.print(col);
            }

            for (int col = 2; col <=row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
}
}
