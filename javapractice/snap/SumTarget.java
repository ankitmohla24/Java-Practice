/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice.snap;

import java.util.Arrays;

/**
 *
 * @author Ankit Mohla
 */
public class SumTarget {
    public static boolean calculate(int[] arr,int t){
        for(int i=0;i<arr.length-2;i++){
            int l=i+1;
            int r=arr.length-1;
            while(l<r){
                if(arr[i]+arr[l]+arr[r]==t){
                    System.out.println(arr[i]+" + "+arr[l]+" + "+arr[r]);
                    return true;
                }
                else if (arr[i] + arr[l] + arr[r] < t)
                    l++;
                 
                else 
                    r--;
            }
        }
        return false;
    }
    
    
    public static void main(String args[]){
       int[] arr=new int[]{1,5,3,2,6,4,7};
       Arrays.sort(arr);
       int target=11;
       calculate(arr,target);
       
    }
}
