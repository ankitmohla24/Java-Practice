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
public class wordAbb {
    public static String abbWord(String s){
        char c;
        int count=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            c=s.charAt(i);
            count=count+1;
            if(i+1>=s.length() || s.charAt(i)!=s.charAt(i+1)){
                sb.append(c);
                sb.append(count);
                count=0;
            }
        }
        if(sb.toString().length()>s.length()){
            return s;
        }
        return sb.toString();
    }
    
    public static void main(String args[]){
        String s="aaabbcccd";
        System.out.println(abbWord(s));
    }
}
