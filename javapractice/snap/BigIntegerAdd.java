/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice.snap;

/**
 *
 * @author Ankit Mohla
 */
public class BigIntegerAdd {
    static int carry;
    public static int[] sum(int[] arr1,int[] arr2, int[]res){
        int l=res.length-1;
        for(int i=arr1.length-1;i>=0;i--){
            res[l]=(arr1[i]+arr2[i]+carry)%10;
            carry=(arr1[i]+arr2[i])/10;
            l=l-1;
        }
        res[0]=carry;
    return res;    
    }
    public static int[] convert(int[] arr, int l){
        int[] temp=new int[l];
        for(int i=arr.length-1;i>=0;i--){
            temp[l-1]=arr[i];
            l=l-1;
        }
        return temp;
    }
    public static int[] sum(int[] arr1,int[] arr2){
        int[] temp;
        int[] res;
        if(arr1.length>arr2.length){
            temp=convert(arr2,arr1.length);
            res=sum(arr1,temp,new int[temp.length+1]);
        
        }
        else{
            temp=convert(arr1,arr2.length);
            res=sum(arr2,temp,new int[temp.length+1]);}
        return res;
    }
    public static void main(String[]Args){
        int[] arr1=new int[]{1,5,7,3,2,6,4};
        int[] arr2=new int[]{9,8,2,4,3,1,8};
        int[] res=sum(arr1,arr2);
        for(int i:res)
        System.out.print(i);
    }
}
