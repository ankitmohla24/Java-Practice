
package javapractice;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class palindromeList {
    public static void main(String[] args) {
        List<Character> str=new LinkedList();
        //List<Character> rev=new LinkedList();
        System.out.println("Enter the String to be checked");
       Scanner scanner = new Scanner(System.in);
       String s= scanner.next().trim();
       for(int i=0;i<s.length();i++){
           str.add(s.charAt(i));
       }
       Boolean a=true;
       for(int i=0;i<str.size();i++){
         if(str.get(i).equals(str.get(str.size()-i-1))){}
         else {a=false;break;}}
         if (a==true)
                 System.out.println("String is a Palindrome");
               
           else System.out.println("Not a Palindrome");
             
       }
           
           
           
           
         /*  rev.add(str.get(str.size()-i-1));}
       if(rev.equals(str)){
               System.out.println("String is a Palindrome");
               }
           else System.out.println("Not a Palindrome");*/
           
       }
    
