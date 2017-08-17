/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice.snap;

import java.util.LinkedList;

/**
 *
 * @author Ankit Mohla
 */
public class ShuffleAnagrams {
    public static void shuffle(String prefix,String A,LinkedList<String> words){
        int l=A.length();
        if(l==0){
            if(!words.contains(prefix))
            words.add(prefix);
        }
        for(int i=0;i<l;i++){
            shuffle(prefix+A.charAt(i),A.substring(0,i)+A.substring(i+1,l));
        }
    }
    public static void shuffle(String prefix,String A){
        LinkedList<String> words=new LinkedList();
        shuffle(prefix,A,words);
        for(String s:words){
            System.out.println(s);
        }
    }
    
    public static void main(String args[]){
        String A="ankit";
        shuffle("",A);
    }
    
}
