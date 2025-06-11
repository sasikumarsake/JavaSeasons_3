package interviewprep;

public class MinJumps {
    public static int minJumps(int[] arr) {
        if (arr == null || arr.length == 0 || arr[0] == 0) {
            return -1;
        }
        
        int n = arr.length;
        if (n == 1) {
            return 0;
        }
        
        int maxReach = arr[0];
        int steps = arr[0];
        int jumps = 1;
        
        for (int i = 1; i < n; i++) {
            if (i == n - 1) {
                return jumps;
            }
            
            maxReach = Math.max(maxReach, i + arr[i]);
            steps--;
            
            if (steps == 0) {
                jumps++;
                if (i >= maxReach) {
                    return -1;
                }
                steps = maxReach - i;
            }
        }
        
        return -1;
    }
    
    public static void main(String[] args) {
       // int[] arr = {2, 3, 1, 1, 2, 4, 2, 0, 1, 1};
    	int[] arr = {1,3,5,8,9,2,6,7,6,8,9};
        System.out.println("Minimum jumps: " + minJumps(arr));
    }
}