/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice.Array;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Ankit Mohla
 */
public class NextLargestPalindrome {
    String iseven(char num[],int len){
     char next[] = new char[len];
     int half=len/2;
     String rev = "";
     String ha = "";
     System.arraycopy(num, 0, next, 0, half);
     for(int i=half-1;i>=0;i--)
        {rev+=num[i];}
     System.out.println(rev);
     for(int i=half;i<len;i++)
        {ha+=num[i];} 
     System.out.println(ha);
     if(Integer.parseInt(rev)>Integer.parseInt(ha)){
        for(int i=0;i<half;i++)
        {next[len-1-i]=num[i];}
        }
     if(Integer.parseInt(rev)<Integer.parseInt(ha)){
        next[half-1]=(char) (num[half-1]+1);
        num[half-1]=(char) (num[half-1]+1);
         for(int i=half-1;i>=0;i--)
        {next[len-1-i]=num[i];}
        }
     return(Arrays.toString(next));
    }
  
    String isodd(char num[],int len){
     char next[] = new char[len];
     int half=len/2;
     String rev = "";
     String ha = "";
     System.arraycopy(num, 0, next, 0, half);
     for(int i=half-1;i>=0;i--)
        {rev+=num[i];}
     System.out.println(rev);
     for(int i=half+1;i<len;i++)
        {ha+=num[i];} 
     System.out.println(ha);
     if(Integer.parseInt(rev)>Integer.parseInt(ha)){
        for(int i=0;i<half;i++)
        {next[len-1-i]=num[i];}
        next[half]=num[half];
     }
     else if(Integer.parseInt(rev)<Integer.parseInt(ha)){
        for(int i=0;i<half;i++)
        {next[len-1-i]=num[i];}
        next[half]=(char) ( num[half]+1);
     }
     
     return(Arrays.toString(next));
    }
    
    public static void main(String[] args)
{
  String numb;
  String next = null;
Scanner in=new Scanner(System.in);

System.out.println("enter num");
numb=in.nextLine();
int len=numb.length();
char arr[]=new char[len];
for(int i=0;i<len;i++){
    arr[i]=numb.charAt(i);
} 
NextLargestPalindrome nlp=new NextLargestPalindrome();
if(len%2==0)
   next=nlp.iseven(arr,len);
else if (len%2==1)
     next=nlp.isodd(arr,len);   
System.out.println(next);
}
}
