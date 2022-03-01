import java.util.Scanner;

public class peakInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,3,2,1};
        System.out.println(peakmountain(arr));


    }

    public static int peakmountain(int[] arr){
        int s = 0, e = arr.length-1;
        while(s<e){
            int m = s + (e-s)/2;
            if(arr[m]>arr[m+1]){ //you're in desending part of the array
                e = m; //end is mid cuz we interested in largest ele in array
            }else{//you're in asc part of array
                s = m + 1; //cuz ,mid+1 ele is greater than mid ele.
        }
    }return s; //at last end and start will point to the largest ele when loop breaks.
} 

}

