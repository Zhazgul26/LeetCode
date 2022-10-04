import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Main {
    public int singleNumber(int[] nums) {
        int length = nums.length;
        boolean isTwice = false;
        for (int i=0; i < length; i++) {
            isTwice = false;
            for (int j=0; j<length; j++) {
                if (isTwice) break;
                if (i != j)
                    if(nums[i] == nums[j])
                        isTwice = true;
            }
            if(!isTwice) return nums[i];
        }
        return nums[length - 1];
    }
}