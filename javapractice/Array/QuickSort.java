package javapractice.Array;

public class QuickSort {
    public static void main(String[] args) {
       Arraydec array=new Arraydec(); 
       array.getarr();
       sort(array.arr);
       
    }

    private static void sort(int[] ar) {
        if(ar.length==0){}
        else{
            int n=ar.length;
          quicksort(0,n-1,ar);  
        }
        System.out.println("Sorted numbers are:"); 
       for(int i=0;i<ar.length;i++){
           System.out.println(ar[i]);
       }  
    }

    private static void quicksort(int low,int high,int[] ar) {
        int i=low;
        int j=high;
        int temp;
        int pivot =ar[(high+low)/2];
        while(i<j){
            while(ar[i]<pivot){i++;}
            while(ar[j]>pivot){j--;}
            if(i<=j){
                temp=ar[i];
                ar[i]=ar[j];
                ar[j]=temp;
            }
        }
        if(low<j)quicksort(low,j-1,ar);
        if(i<high)quicksort(i+1,high,ar);
    }
    
}