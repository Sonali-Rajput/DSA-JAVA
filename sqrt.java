import java.util.Scanner;

public class sqrt {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int x = num.nextInt();
        System.out.println(Squart(x));
        num.close();
        
    }
    static int Squart(int x){
        if(x<=1)
            return x;
        return binarySearch(x);
    }
    static int binarySearch(int x){
        int start = 1, end = x/2, mid, ans =0;
        long temp;
        while(start<=end){
            mid = start + (end - start)/2;
            temp = (long)mid * (long)mid;
            if(temp== x){
                return mid;
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
        return ans;
        
    }
}
