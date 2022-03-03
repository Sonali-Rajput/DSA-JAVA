public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {3,6,12,22,29,30,45};
        int target = 22;
        System.out.println(search(arr,target));
        
    }
    public static int search(int[] nums, int target) {
        int s = 0 , e = nums.length-1;
        while(s<=e){
            int m = s + (e-s)/2;
            if(target<nums[m]){
                e = m-1;
            }else if(target>nums[m]){
                s = m+1;
            }else{
                return m;
            }
        }return -1;
    }
}
