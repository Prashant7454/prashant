package com.botcoder;
import java.util.Scanner;
import java.lang.Math;
public class game 
{

     public static void main(String[] args) 
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("this is a game of rock paper scissor");
      System.out.println("enter\n1 for rock\n2 for paper\n3 for scissor");
      int inp = sc.nextInt();
      int comp = (int)(Math.random()*3);
      if(comp==0)
      {
      System.out.println("computer has rock");
      }
      else if(comp==1)
      {
      System.out.println("computer has paper");
      }    
      else if(comp==2)
      {
      System.out.println("computer has scissor ");
      }
      if((inp==1&&comp==1)||(inp==2&&comp==2)||(inp==3&&comp==0))
      {
      System.out.println("computer is winner");
      }
      else if((inp==1&&comp==2)||(inp==2&&comp==0)||(inp==3&&comp==1))
      {
      System.out.println("you are winner");  
      }
      else if((inp-1)==comp)
      {
      System.out.println("match is tie");
      }
      else
      {
      System.out.println("you enter wrong number");
      }
   }

}
