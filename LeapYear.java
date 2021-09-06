package com.botcoder;
import java.util.Scanner;
public class LeapYear {

  public static void main(String[] args) {
  System.out.println("enter a year :");
  Scanner sc = new Scanner(System.in);
  int a = sc.nextInt();
  if(a%400==0)
  {
  System.out.println("year is leap year");
    
  }
  
  else if(a%100==0)
  {
  System.out.println("year is not leap year");
    
  }
  
  else if(a%4==0)
  {
  System.out.println("year is leap year");
    
  }
  else
  {
  System.out.println("year is not leap year");
    
  }  
  
  }

}
