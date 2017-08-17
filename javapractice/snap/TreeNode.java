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
public class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode parent;
    TreeNode(int data){
        this.data=data;
        this.left=null;
        this.right=null;
        this.parent=null;
    }
    TreeNode(){
        this.left=null;
        this.right=null;
        this.parent=null;
    }
}
