package javapractice;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 *
 * @author Ankit Mohla
 */
public class MinWindow {
    public static String minWindow(String S, String T) {
        
        if (S.length()==0||T.length()==0||S.length()<T.length()) return "";
        
        int left=T.length(),start=-1,end=S.length();
        
        Deque<Integer> queue= new LinkedList();
        
        Map<Character,Integer> map= new HashMap();
        
        for (int i=0;i<T.length();i++){
            char c= T.charAt(i);
            map.put(c,map.containsKey(c)?map.get(c)+1:1);
        }
        
        for (int i =0;i<S.length();i++){
            char c= S.charAt(i);
            if (!map.containsKey(c))
                continue;
            
            int n = map.get(c);
            map.put(c,n-1);
            queue.add(i);
            if (n>0) left--;
            
            char head = S.charAt(queue.peek());
            while(map.get(head)<0){
            	queue.poll();
            	map.put(head,map.get(head)+1);
            	head=S.charAt(queue.peek());
            }
            
            if (left==0){
            	int new_length=queue.peekLast()-queue.peek()+1;
            	if (new_length<end-start) {
            	    start=queue.peek();
            	    end=queue.peekLast()+1;
            	} 
            }
        }
        if (left==0)  return S.substring(start,end);
        else return "";
    }
    
    public static void main(String args[]){
        String s="adobecodebanc";
        String t="abc";
        System.out.println(minWindow(s,t));
    }
}

