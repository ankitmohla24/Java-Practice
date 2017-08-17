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
public class Linkedlist {
    ListNode head;
    Linkedlist(){
        head=null;
    }
    void insert(int data) {
       head = insert(head, data);
    }
    ListNode insert(ListNode node,int data){
        if (node == null) {
            ListNode temp = new ListNode(data);
            return temp;
        }
        else{
            node.next=insert(node.next,data);
        }
        return node;
    }
    int length(){
       return length(head); 
    }
    int length(ListNode node){
        if (node==null) return 0;
        return 1 + length(node.next);
    }
    void print(){
        print(head);
    }
    void print(ListNode n){
        if(n!=null){
            System.out.print(n.data+" ");
            print(n.next);
        }
    }
    ListNode find(int data){
        return find(head,data);
    }
    ListNode find(ListNode n,int data){
        if(n!=null){
            if(n.data==data) return n;
            else return find(n.next,data);
        }
        return null;
    }
    ListNode findMin(){
        return findMin(head);
    }
    ListNode findMin(ListNode root){
       ListNode min=root;
       while(min.next!=null){
           if(min.data>min.next.data)
           min=min.next;
       }
       return min; 
    }
    ListNode findMax(){
        return findMax(head);
    }
    ListNode findMax(ListNode root){
       ListNode max=root;
       while(max.next!=null){
           if(max.data>max.next.data)
           max=max.next;
       }
       return max; 
    }
    ListNode delete(){
        return delete(head);
    }
    ListNode delete(ListNode node){
        if(node==null)return null;
        if(node.next.next==null){
            ListNode del=node.next;
            node.next=null;
            return del;
        }
        return delete(node.next);
    }
    void reverse(){
        head=reverse(head);
    }
    ListNode reverse(ListNode head){
        ListNode current=head;
        ListNode previous=null;
        ListNode next=null;
        while(current!=null){
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        return previous;
        
    }
}
