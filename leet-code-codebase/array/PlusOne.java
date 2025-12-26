import java.util.*;
public class PlusOne{
	public static int [] plusone(int[] arr, int size){
	int digit  = size-1;
	    for(int i = size-1 ; i >=0 ;i--){
		if( arr[i] != 9 )
		    {
			arr[digit] =  arr[digit]+1;
			return arr;
		    }
		arr[digit] = 0;
		digit--;
	
	    }

	int[] result = new int[size+1];
	result[0] =1;
	return result;
	
	}
	
	public static void main(String[] args)
{
	int[] nums = {9,9}; //124
	int[] result = plusone(nums, nums.length);
	for ( int i=0;i<result.length;i++)
	System.out.println(result[i]);
}
}