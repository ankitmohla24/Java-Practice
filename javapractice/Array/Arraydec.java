/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice.Array;

import java.util.Scanner;

/**
 *
 * @author Ankit Mohla
 */
public class Arraydec {
    int arr[];
    int n;
    public void getarr(){
        System.out.println("Enter the number of numbers to be sorted");
       Scanner scanner = new Scanner(System.in);
        this.n = scanner.nextInt();
        arr = new int[n];
       System.out.println("Enter the numbers to be sorted"); 
       for(int i=0;i<n;i++){
           this.arr[i]=scanner.nextInt();
       } 
    }
}
