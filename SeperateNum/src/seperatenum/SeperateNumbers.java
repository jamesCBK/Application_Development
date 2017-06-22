/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package seperatenum;

/**
 *
 * @author HP
 */
import java.io.*;
import java.util.*;
class SeperateNumbers{
  public static void main(String[]args){
    int r=0,t=0,len,lencount,m=0;
    System.out.println("enter a mumber");
     Scanner sc=new Scanner(System.in);
 r = sc.nextInt();
 len = Integer.toString(r).length();
 lencount = len;
  int arr[] = new int[len];
  while(r>0)
  {
  t = r%10;
  arr[m] = t;
  m++;
  lencount--;
    r = r/10;
  }
  for(int i=len-1;i>=0;i--){
      System.out.println(+arr[i]);
  }}
}