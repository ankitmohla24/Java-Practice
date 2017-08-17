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
public class ReverseALinkedList {
    public static void main(String[] args){
        Linkedlist ls=new Linkedlist();
        ls.insert(1);
        ls.insert(1);
        ls.insert(3);
        ls.insert(9);
        ls.insert(7);
        ls.insert(5);
        ls.insert(8);
        ls.insert(2);
        ls.print();
        ls.reverse();
        System.out.println();
        ls.print();
        
    }
}
