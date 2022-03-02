public class peakelement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,7,3,2,1};
        System.out.println(findPeakElement(arr));
        
    }
    public static int findPeakElement(int[] nums) {
        int s = 0, e = nums.length-1;
        while(s<e){
            int m = s + (e-s)/2;
            if(nums[m]>nums[m+1]){ //you're in desending part of the array
                e = m; //end is mid cuz we interested in largest ele in array
            }else{//you're in asc part of array
                s = m + 1; //cuz ,mid+1 ele is greater than mid ele.
        }
    }return s; //at last end and start will point to the largest ele when loop breaks.
        
    }
    
}
