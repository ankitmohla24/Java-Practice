package javapractice.Array;

public class InsertionSort {

    
    public static void main(String[] args) {
        Arraydec array=new Arraydec(); 
       array.getarr();
       sort(array.arr);
    }

    private static void sort(int[] ar) {
        int temp;
       for(int i=1;i<ar.length;i++){
           for (int j=i;j>0;j--){
               if(ar[j]<ar[j-1]){
                   temp=ar[j];
                   ar[j]=ar[j-1];
                   ar[j-1]=temp;
               }
           }
       }
       System.out.println("Sorted numbers are:"); 
       for(int i=0;i<ar.length;i++){
           System.out.println(ar[i]);
       }  
    }

    
}
