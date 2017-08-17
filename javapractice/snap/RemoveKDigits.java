/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice.snap;

import java.util.Stack;

/**
 *
 * @author Ankit Mohla
 */
public class RemoveKDigits {
    public static String remkdigits(String num, int k){
        int i=0;
        if(k==0)return num;
        if(k==num.length())return "0";
        Stack<Character> s=new Stack();
        while(i<num.length()){
            while(k>0 && !s.isEmpty() && s.peek()>num.charAt(i)){
                s.pop();
                k--;
            }
            s.push(num.charAt(i));
            i++;
        }
        while(k>0){
            s.pop();
            k--;
        }
        StringBuilder sb=new StringBuilder();
        while(!s.isEmpty()){
            sb.append(s.pop());
        }
        String newnum=sb.reverse().toString();
        return newnum;
    }
    
    public static void main(String args[]){
        String num="1432219";
        int k=3;
        System.out.println(remkdigits(num,k));
    }
}
