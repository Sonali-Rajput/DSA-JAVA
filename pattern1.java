public class pattern1 {
    public static void main(String[] args) {
        pattern11(5);
    }
    static void pattern11(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row+1;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
