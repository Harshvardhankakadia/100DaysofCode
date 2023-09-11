import java.util.*;
class Solution {
    public int threeSumClosest(int[] nums, int target) {
       
       int closest = Integer.MAX_VALUE;
       
       Arrays.sort(nums);
       int sum = 0;
       for (int  i=0; i<nums.length; i++){

        int ptr1 = i+1; int ptr2 = nums.length-1;

        while(ptr1 < ptr2){
            
            sum = nums[i] + nums[ptr1] + nums[ptr2];
         
         if(Math.abs(target - closest) > Math.abs(target - sum))
         closest = sum;
         
         if  (sum > target )
         ptr2--;

         else
         ptr1++;


        } 
        


       }
       
        return closest;
    }
}