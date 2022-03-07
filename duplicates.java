import java.util.Arrays;

public class duplicates{
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,3};
        System.out.println(findDuplicate(arr));
        
    }
    public static int findDuplicate(int[] arr){
        int i = 0;
        while(i<arr.length){
            if(arr[i]!=i+1){ //whether element is at it's corrct value(index+1) or not
                int correctindex = arr[i]-1; //the element should be at the correct position to be sorted.
                if(arr[i]!=arr[correctindex]){ //check whether the ele is present at the correct position or not
                    swap(arr,i,correctindex);
                }
                else{
                    return arr[i]; //ans is found i.e the duplicate element.
                }
            }
            else{
                i++;
            }

            }
            return -1;
        }
        static void swap(int[] arr,int first,int last){ // for swapping the ele with it's correct index/position.
        int temp = arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
    
    }
