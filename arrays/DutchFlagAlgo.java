package arrays;

public class DutchFlagAlgo {

	public static void main(String[] args) {
		int nums[] = {1,1,0,2,0,1,2,1};
		        int i=0, start=0, end=nums.length-1;
		        while(i<=end){
		            if(nums[i]==0){
		                int t = nums[start];
		                nums[start] = nums[i];
		                nums[i] = t;
		                start++;
		                i++;
		            }
		            else if(nums[i]==2){
		                int t = nums[end];
		                nums[end] = nums[i];
		                nums[i] = t;
		                end--; 
		            }
		            else{
		                i++;
		            }
		        }
		        
		        for(int p = 0; p<nums.length; p++) {
					System.out.print(nums[p] + " ");
				}
		        
		    }
}
