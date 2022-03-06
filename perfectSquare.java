import java.util.Scanner;

public class perfectSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(isPerfectSquare(num));
        in.close();
    }
        public static boolean isPerfectSquare(int num) {
            if(num<1)
                return false;
            if(num==1){
                return true;
            }
            return binarySearch(num);
            
        }
        public static boolean binarySearch(int x){
            int start = 1, end = x/2, mid, ans =0;
            long temp;
            while(start<=end){
                mid = start + (end - start)/2;
                temp = (long)mid * (long)mid;
                if(temp== x){
                    return true;
                }
                if(temp < x){
                    ans = mid;
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
    
                }
                //return (int)ans;
            }
            return false;
            
        }
    }
