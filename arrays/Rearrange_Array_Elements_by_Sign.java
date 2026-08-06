
import java.util.*;
public class Rearrange_Array_Elements_by_Sign {
    public static void main(String[] args) {
        int nums[] = {1,2,-3,-1,-2,3 };
        int n=nums.length;
        int pos_index=0;
        int neg_index=1;
        int[] ans =new int[n];
        for(int num:nums){
            if(num<0){
                ans[neg_index]=num;
                neg_index+=2;
            }else{
                ans[pos_index]=num;
                pos_index+=2;
            }
        }

        
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
