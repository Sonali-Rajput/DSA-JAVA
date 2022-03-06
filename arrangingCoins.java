public class arrangingCoins {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(arrangeCoins(n));
        
    }
    public static int arrangeCoins(int n) {
        int s = 0 , e = n;
        int ans = 0;

        while(s<=e){
            int m = s + (e-s)/2; 
            long sum = (long)m*(m+1)/2; //total number of coins that can fit in that particular row.
            if(sum==n){
                return m;
            }
            if(n>=sum){ //no. of coins is greater than total sum of coin then search in right.
                s = m+1;
                ans= m;
            }else { //search in right
                e = m-1;
            }
    }return ans;
}
}