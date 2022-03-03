public class minRotated{
    public static void main(String[] args) {
        int[] arr = {3,4,5,7,0,1,2};
        int pivot = searchPivot(arr);
        System.out.println(arr[pivot+1]);
        
    }
    public static int binarysearch(int[] nums,int start,int end,int target) {
        //int s = 0 , e = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<nums[mid]){
                end = mid-1;
            }else if(target>nums[mid]){
                start = mid+1;
            }else{
                return mid;
            }
        }return -1;
    }
    public static int searchPivot(int[] nums) {
        int start = 0, end = nums.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(mid<end&&nums[mid]>nums[mid+1]){ //when the array is in desc then mid will be pivot
                return mid;
            }
            if(mid>start&&nums[mid]<nums[mid-1]){ /*same as above just our mid position is different
                 so there must be a case when mid-1 will be the pivot ele.*/
                 return mid-1;
            }
            if(nums[mid]<=nums[start]){ /*all elements after mid will be less than start ele 
                hence we can ignore all those elements since we are looking for peak.*/
                end = mid - 1;

            }else{ //(start ele<mid ele),all ele are greater than start ele so ignore mid and search in mid+1
                start = mid +1;
            }
        }return -1;
        
    }
}
