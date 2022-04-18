import java.util.Scanner;

public class sqrt {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int x = num.nextInt();
        int p =3; //precision
        System.out.printf("%.3f",binarySearch_sqrt(x,p));
        num.close();
    }
    static double binarySearch_sqrt(int x,int p){
        int start = 0, end = x, mid;
        double root = 0.0;
        long temp;
        while(start<=end){
            mid = start + (end - start)/2;
            temp = (long)mid * (long)mid;
            if(temp== x){
                return mid;
            }
            if(temp > x){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        double incr = 0.1;
        for(int i=0;i<p;i++){
            while(root*root<=x){
                root += incr;
            }
            root -=incr;
            incr/=10;
        }
        return root;
    }
}
