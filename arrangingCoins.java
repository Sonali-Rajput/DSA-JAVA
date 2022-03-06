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
            long sum = (long)m*(m+1)/2;
            if(sum==n){
                return m;
            }
            if(n>=sum){
                s = m+1;
                ans= m;
            }else {
                e = m-1;
            }
    }return ans;
}
}