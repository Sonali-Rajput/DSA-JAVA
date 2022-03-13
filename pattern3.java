public class pattern3 {
    public static void main(String[] args) {
        pattern11(7);
    }
    static void pattern11(int n){
        for(int row=1;row<2*n-1;row++){
            int columnsinRow = row>n?2*n-row:row; //formula of cols with rows relation when row>n (as col starts getting decrease)
            for(int col=1;col<columnsinRow;col++){ //2*n-row , here we actually deleting the spaces from the entire N.
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
