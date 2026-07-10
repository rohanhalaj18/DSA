import java.util.*;
class Left_Rotate{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};
        int inital=arr[0];
        for(int i=1;i<arr.length;i++){
           arr[i-1]=arr[i]; 
        }
        arr[arr.length-1]=inital;
        System.out.println(Arrays.toString(arr));
    }
}