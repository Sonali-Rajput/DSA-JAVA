import java.util.ArrayList;
import java.util.List;

public class AllDuplicates {
    public List<Integer> findDuplicates(int[] nums){
        int i = 0;
        while(i<nums.length){ //it'll go till end of the numsay
            int correctindex = nums[i]-1; //the element should be at the correct position to be sorted.
            if(nums[i]!=nums[correctindex]){ //check whether the ele is present at the correct position or not
                swap(nums,i,correctindex);
        }
        else{
            i++; //moving to next ele.
        }
    }
    List<Integer> ans = new ArrayList<>();
    for(int index=0;index<nums.length;index++){
        if(nums[index]!=index+1){
            ans.add(nums[index]);
        }
    }
    return ans;
}
    static void swap(int[] nums,int first,int last){ // for swapping the ele with it's correct index/position.
        int temp = nums[first];
        nums[first]=nums[last];
        nums[last]=temp;
    }
}
