import java.util.HashMap;
import java.util.Scanner;

class SingleNumberHashMap{

    public static int singleNumber ( int[] nums){
	HashMap<Integer, Integer> mpp = new HashMap<>();
	for ( int x : nums){
	    mpp.put(x, mpp.getOrDefault(x,0) + 1);
	}
	
	for ( int x : mpp.keySet()){
	    if (mpp.get(x) == 1 ){
		return x;	
	    }
	}
	return 0;
    }

     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = singleNumber(nums);
        System.out.println("Single occurring number: " + result);

        sc.close();
	}
}