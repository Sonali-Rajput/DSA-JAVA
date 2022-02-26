public class linearSearch{
    public static void main(String[] args) {
        int[] arr1 = {34,12,5,8,20,-3,-1};
        int target = 20;
        int answer = linearsearch(arr1,target);
        System.out.println(answer);
    }


static int linearsearch(int[] arr, int target){
    if(arr.length==0){ //array is empty
        return -1; 
    }
    for(int index = 0; index<arr.length;index++){ //traversing through the array
        int element = arr[index]; //initializing element with first num present in the array
        if(element==target){ //checking if the elemet we're searching is equal to the element
            return index; //if the target element is there then returning it's index.
        }
    }
    return -1;
}
}

