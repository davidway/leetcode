import java.util.ArrayList;
import java.util.Arrays;

public class LeetCode1313 {
    public static void main(String[] args) {
        Integer[] nums ={1,2,3,4};
        int[] out = decompressRLElist(nums);
        Integer[] result= {2,4,4,4};
        System.out.println(Arrays.toString(out));

    }

    private static int[] decompressRLElist(Integer[] nums) {
        int n = nums.length;
        int alength=0;
        int blength=0;
        Integer[] a = new Integer[n/2];
        Integer[] b = new Integer[n/2];
        ArrayList<Integer> arrayList = new ArrayList();
        for ( int i=0 ; i<n ; i++){
            if ( i%2==0){
                a[alength]=nums[i];
                alength++;
            }else{
                b[blength]=nums[i];
                blength++;
            }
        }

        for (int i = 0; i <alength ; i++) {
            for (int j = 0; j < a[i]; j++) {
                arrayList.add(b[i]);
            }
        }
        int[] result = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            result[i] = arrayList.get(i);
        }
        return result;
    }
}
