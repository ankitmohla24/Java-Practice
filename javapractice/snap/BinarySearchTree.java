/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice.snap;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Ankit Mohla
 */
public class BinarySearchTree {
    TreeNode head;
    
    BinarySearchTree() { 
        head = null; 
    }
    void insert(int key) {
       head = insert(head, key);
    }
    TreeNode insert(TreeNode node, int data) {
        if (node == null) {
            TreeNode temp = new TreeNode(data);
            return temp;
        } 
        else
            if (data <= node.data) {
                node.left = insert(node.left, data);
                node.left.parent = node;
 
            } else {
                node.right = insert(node.right, data);
                node.right.parent = node;
            }
        return node;
    }
    int height(){
       return height(head)-1; 
    }
    int height(TreeNode root){
        if (root==null) return 0;
        return 1 + Math.max(height(root.left),height(root.right));
    }
    void print(){
        print(head);
    }
    void print(TreeNode r){
        if(r!=null){
            print(r.left);
            System.out.print(r.data+" ");
            print(r.right);
        }
    }
    TreeNode find(int data){
        return find(head,data);
    }
    TreeNode find(TreeNode r,int data){
        if(r!=null){
            if(r.data==data) return r;
            else if(data<r.data) return find(r.left,data);
            else if(data>r.data) return find(r.right,data);
        }
        return null;
    }
    TreeNode findMin(){
        return findMin(head);
    }
    TreeNode findMin(TreeNode root){
       TreeNode min=root;
       while(min.left!=null){
           min=min.left;
       }
       return min; 
    }
    TreeNode findMax(){
        return findMax(head);
    }
    TreeNode findMax(TreeNode root){
       TreeNode max=root;
       while(max.right!=null){
           max=max.right;
       }
       return max; 
    }
    TreeNode delete(int data){
        return delete(head,data);
    }
    TreeNode delete(TreeNode r,int data){
        if(r==null)return null;
        TreeNode n=find(r,data);
        if(n.left==null && n.right==null){
            if(n.parent.left==n){
                n.parent.left=null;
                return n;
            }
            else if(n.parent.right==n){
                n.parent.right=null;
                return n;
            }
        }
        else if(n.left==null || n.right==null){
            if(n.left==null &&n.parent.right==n){
                n.parent.right=n.right;
                return n;
            }
            else if(n.left==null && n.parent.left==n){
                n.parent.left=n.right;
                return n;
            }
            if(n.right==null && n.parent.right==n){
                n.parent.right=n.left;
                return n;
            }
            else if(n.right==null &&n.parent.left==n){
                n.parent.left=n.left;
                return n;
            }
        }
        if(n.left!=null && n.right!=null){
            int hl=height(n.left);
            int hr=height(n.right);
            if(hl>hr){
                TreeNode max=findMax(n.left);
                int temp;
                temp=n.data;
                n.data=max.data;
                max.data=temp;
                return delete(max,data);
            }
            if(hr>hl){
                TreeNode min=findMin(n.right);
                int temp;
                temp=n.data;
                n.data=min.data;
                min.data=temp;
                return delete(min,data);
            }
        }
        return n;
    }
    int closestValue(double num){
        return closestValue(head,num);
    }
    int closestValue(TreeNode root,double num){
        double min=Double.MAX_VALUE;
        int result = root.data;

        while(root!=null){
            if(num>root.data){

                double diff = Math.abs(root.data-num);
                if(diff<min){
                    min = Math.min(min, diff);
                    result = root.data;
                }
                root = root.right;
            }else if(num<root.data){

                double diff = Math.abs(root.data-num);
                if(diff<min){
                    min = Math.min(min, diff);
                    result = root.data;
                }
                root = root.left;
            }else{
                return root.data;
            }
        }

        return result;
    }
    /*int findKthLargest(int k){
        int c=0;
        if(findKthLargest(head,k,c)!=null)
            return findKthLargest(head,k,c).data;
        else return 0;
    }
    
    TreeNode findKthLargest(TreeNode node,int k,int c){
        if(node==null)
            return null;
        if(node.right!=null){
            return findKthLargest(node.right,k,c);
        }
        c=c+1;
        if(c==k)
            return node;
        return findKthLargest(node.left,k,c);
    }*/
    void LevelTraversal(){
        Queue<TreeNode> q=new LinkedList();
        q.add(head);
        while(!q.isEmpty()){
            TreeNode n=q.remove();
            System.out.print(n.data+" ");
            if(n.left!=null)
                q.add(n.left);
            if(n.right!=null)
                q.add(n.right);
        }
    }
    
    
    
    
    
    
    
    
}
