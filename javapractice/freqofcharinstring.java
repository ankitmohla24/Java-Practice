package javapractice;

import java.util.Scanner;

/**
 *
 * @author Ankit Mohla
 */
public class freqofcharinstring {
   public static void main(String[] args)
{
    //Copyright of Abhishek
String s;
Scanner in=new Scanner(System.in);

System.out.println("enter name");
s=in.nextLine();
int len=s.length();
char ch;
for(char i='a';i<='z';i++)
{
    int count=0;
    for(int j=0;j<len;j++)
    {
    ch=s.charAt(j);
    if(i==ch)
    count++;}
    if(count!=0)
    {
    System.out.println(i+" value is "+count);
    
    }}}
}
