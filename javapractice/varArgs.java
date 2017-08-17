/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;

/**
 *
 * @author Ankit Mohla
 */
public class varArgs {
    static void vatest(int ... v){
        System.out.println("No of Args="+v.length+"\nContents:\n");
        
        for(int x:v){
            System.out.print(x+" ");
        System.out.println();
        }
    }
    public static void main(String args[]){
        vatest(10);
        vatest(1,2,3);
        vatest();
    }
}
