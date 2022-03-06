import java.util.Arrays;

public class insertionSort { 
    public static void main(String[] args) {
        int[] arr = {5,3,4,1,2};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void insertion(int[] arr){ //with every part LHS wil be getting sorted.
        for(int i=0;i<arr.length-1;i++){ //cuz our array will get sorted till arr.length - 2
            for(int j=i+1;j>0;j--){ // it will sort from index(i+1) till the left of arr
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else{
                    break; //if the arr left side is already sorted
                }
            }
        }
    }
    /*use case: it is adaptive: steps get reduced if array is sorted.
    no. of swaps reduced as compared to bubble sort.
    stable
    works good when array is partially sorted that's why it takes part in hybrid sorting algorithms */

}
