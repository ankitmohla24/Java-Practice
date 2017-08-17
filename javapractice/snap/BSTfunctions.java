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
public class BSTfunctions {
    public static void main(String[] args) {
        int k=4;
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(10);
        tree.insert(8);
        tree.insert(15);
        tree.insert(4);
        tree.insert(9);
        tree.insert(11);
        tree.insert(20);
        tree.insert(3);
        tree.insert(7);
        tree.insert(17);
        tree.insert(21);
        tree.insert(5);
        tree.insert(25);
        tree.insert(24);
        System.out.println(tree.delete(20).data);
        tree.print();
        System.out.println();
        System.out.println(tree.closestValue(16.0));
        //System.out.println(tree.findKthLargest(5));
        tree.LevelTraversal();
        
    }    
}
