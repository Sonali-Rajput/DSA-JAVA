/*printing   
    1
   212
  32123
 4321234*/
public class pattern5 {
    public static void main(String[] args) {
        pattern11(4);
    }
    static void pattern11(int n) {
        for (int row = 1; row <=n; row++) {
            for (int space = 0;space<n-row;space++) { //for spaces
                System.out.print(" ");
            }
            for (int col = row;col>=1;col--) { //for 21,321,4321..so on
                System.out.print(col);
            }

            for (int col = 2; col <=row; col++) {//for 2,23,234,2345..so on
                System.out.print(col);
            }
            System.out.println(); //for new line
        }
}
}
