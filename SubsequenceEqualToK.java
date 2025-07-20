package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsequenceEqualToK {

    public static void main(String[] args) {
        int arr[] = {1,2,1};
        List<Integer> list1 = new ArrayList<>() ;
        int sum =0;
        int k =2;
        subsequence(0,sum,arr,list1,k);
    }

    private static void subsequence(int i, int sum, int[] arr, List<Integer> list1,int k) {
        if(i== arr.length){
            if(sum <= k){
                System.out.println(list1);

            }
            return;
        }
        list1.add(arr[i]);
        sum = sum + arr[i];
        subsequence(i+1,sum,arr,list1,k);

        list1.remove(list1.size() - 1);
        sum = sum - arr[i];
        subsequence(i+1,sum,arr,list1,k);
    }
}
