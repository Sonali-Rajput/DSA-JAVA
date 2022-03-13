public class pattern2 {
    public static void main(String[] args) {
        pattern11(5);
    }
    static void pattern11(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
