import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,6,1,2,8,4,7,0};
        bubblesorting(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void bubblesorting(int[] arr){
        boolean swapp;
        for(int i=0;i<arr.length;i++){
            swapp = false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapp = true;
                }
            }
            //if you did not swap for a particular valur of i , that means array is already sorted.
            //and hence stop the loop .
            if(!swapp){
                break;
            }
        }
    }
    
}
