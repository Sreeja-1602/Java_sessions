package java_training;

public class Solution {
    public static void main(String[] args){
    public  boolean containsDuplicate(int[] nums){
        for(int i =0;i<nums.length;i++){
            for(int j=1;j<nums.length;j++){
                if(nums[1]==nums[j]){
                    return true;
                }
            }
            
        }
        return false;
    }
}
    
}
