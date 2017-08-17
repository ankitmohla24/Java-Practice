
package javapractice.Array;


public class mergesort {
     public static void main(String[] args) {
       Arraydec array=new Arraydec(); 
       array.getarr();
       sort(array.arr);
       
    }

    private static void sort(int[] ar) {
        if(ar.length==0){}
        else{
            int n=ar.length;
          mergesort(0,n-1,ar);
         }
        System.out.println("Sorted numbers are:"); 
       for(int i=0;i<ar.length;i++){
           System.out.println(ar[i]);
       }  
    }

    private static void mergesort(int low, int high, int[] ar) {
        if(low<high){
            int mid=(low+high)/2;
            mergesort(low,mid,ar);
            mergesort(mid+1,high,ar);
            merge(low,mid,high, ar);
        }
    }

    private static void merge(int low, int mid, int high, int[] ar) {
        int helper[]=new int[ar.length] ;
        // Copy both parts into the helper array
        for (int i = low; i <= high; i++) {
            helper[i] = ar[i];
        }

        int i = low;
        int j = mid + 1;
        int k = low;
        // Copy the smallest values from either the left or the right side back
        // to the original array
        while (i <= mid && j <= high) {
            if (helper[i] <= helper[j]) {
                ar[k] = helper[i];
                i++;
            } else {
                ar[k] = helper[j];
                j++;
            }
            k++;
        }
        // Copy the rest of the left side of the array into the target array
        while (i <= mid) {
            ar[k] = helper[i];
            k++;
            i++;
        }

    }
}

