/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice.snap;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Ankit Mohla
 */
public class WordBreak {
    public static boolean check(String s,Set<String> dict){
        StringBuilder sb=new StringBuilder();
        int i;
        for(i=0;i<s.length();i++){
            sb.append(s.charAt(i));
            if(dict.contains(sb.toString())){
                sb.setLength(0);
            }
        }
        if(sb.length()==0)
            return true;
        return false;
    }
    
    public static void main(String []args){
        String s="leetcode";
        Set<String> dict=new HashSet();
        dict.add("leet");
        dict.add("code");
        System.out.println(check(s,dict));
    }
}
