
import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void selection(int[] arr){
        for(int i = 0;i<arr.length-1;i++){
            int lastElement = arr.length - i -1;
            int maxIndex = maximum(arr,0,lastElement);
            swap(arr,maxIndex,lastElement);
        }
    }
    static void swap(int[] arr,int first,int last){
        int temp = arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
    static int maximum(int[] arr,int start,int end){
        int max = start;
        for(int i=0;i<=end;i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
}
}
