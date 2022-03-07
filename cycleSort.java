import java.util.Arrays;
//use it when range is given from [1,N] or [0,N] in continuous manner like [5,3,4,1,2] (it's of size N=5 not a single num is missing)
//to find the missing num
public class cycleSort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        sorting(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void sorting(int[] arr){
        int i = 0;
        while(i<arr.length){ //it'll go till end of the array
            int correctindex = arr[i]-1; //the element should be at the correct position to be sorted.
            if(arr[i]!=arr[correctindex]){ //check whether the ele is present at the correct position or not
                swap(arr,i,correctindex);
        }
        else{
            i++; //moving to next ele.
        }
    }
}
    static void swap(int[] arr,int first,int last){ // for swapping the ele with it's correct index/position.
        int temp = arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
    
}
