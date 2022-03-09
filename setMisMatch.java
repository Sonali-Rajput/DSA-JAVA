import java.util.Arrays;

public class setMisMatch {
    public static void main(String[] args) {
        int[] nums = {2,1,4,2,6,5};
        findErrorNums(nums);
        System.out.println(Arrays.toString(nums));
        
    }
    public static int[] findErrorNums(int[] nums){
        int i = 0;
        while(i<nums.length){ //it'll go till end of the numsay
            int correctindex = nums[i]-1; //the element should be at the correct position to be sorted.
            if(nums[i]!=nums[correctindex]){ //check whether the ele is present at the correct position or not
                swap(nums,i,correctindex);
        }else{
            i++; //moving to next ele.
        }
    }
        //search for first missing number  
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index+1){
                return new int[] {nums[index],index+1};//that number at the missing index is the duplicate
            }
        }
        return new int[] {-1,-1};
    }
    static void swap(int[] nums,int first,int last){ // for swapping the ele with it's correct index/position.
        int temp = nums[first];
        nums[first]=nums[last];
        nums[last]=temp;
    }
    
}
