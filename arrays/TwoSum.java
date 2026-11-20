package arrays;

public class TwoSum {

	public static void main(String[] args) {
		    	
		int arr[] = {3,5,1,7,2,2,3,-1,8,9};
		int target =4;
		boolean found = false;//
		
		int arr1[] = new int[2];
		
		     for(int i=0; i<arr.length; i++){
		    	 
		        for(int j=i+1; j<arr.length; j++){
		        	
		              if((arr[i]+arr[j])==target){
		                    arr1[0]=i;
		                    arr1[1]=j;
		                    System.out.println(arr1[0]+" "+arr1[1]);
		                    found = true;
		                }
		              
		            }
		        
		        }
		     if(found) {
		    	 System.out.println(arr1[0] + " " + arr1[1]);
		     }else {
		    	 System.out.println("not found");
		     }
		        
		    }
		}
