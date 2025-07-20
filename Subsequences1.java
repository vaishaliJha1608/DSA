package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsequences1 {

    public static void main(String[] args) {
        int arr[] = {3,1,2};
        List<Integer> list1 = new ArrayList<>() ;
        subsequences(0,arr.length,arr,list1);
    }

    private static void subsequences(int ind,int n, int[] arr, List<Integer> list1) {
        if(ind >= n){
            System.out.println(list1);
            return;
        }
        list1.add(arr[ind]); //Take condition

        subsequences(ind +1, n,arr,list1);

        list1.remove(list1.size() - 1);

        subsequences(ind +1, n,arr,list1); // Not Take Condition
    }

}
