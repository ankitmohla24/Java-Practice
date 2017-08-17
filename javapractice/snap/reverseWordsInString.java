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
public class reverseWordsInString {
    public static String revWord(String word){
        char arr[]=word.toCharArray();
        for(int i=0;i<arr.length/2;i++){
            char temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        StringBuilder sb=new StringBuilder();
        for(char c:arr){
            sb.append(c);
        }
        return sb.toString();
    }
    
    public static String revSentence(String sentence){
        String arr[]=sentence.split("");
        for(int i=0;i<arr.length/2;i++){
            String temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=revWord(temp);
        }
        StringBuilder sb=new StringBuilder();
        for(String s:arr){
            sb.append(s).append(" ");
        }
        return sb.toString().trim();
    }
    
    
    public static void main(String args[]){
    String sentence="My Name Is Ankit";
    String res=revSentence(sentence);
    System.out.println(res);
}
}
