package com.botcoder;
import java.util.Scanner;
public class days {

  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int date = sc.nextInt();
  int a = date%7;
  if(date<31){
  switch (a) {
     case 1:
     System.out.println("today is monday");
     break;
     case 2 :
     System.out.println("today is tuesday");
     break;
     case 3 :
     System.out.println("today is wednsday");
     break;
     case 4 :
     System.out.println("today is thursday");
     break;
     case 5 :
     System.out.println("today is friday");
     break;
     case 6 :
     System.out.println("today is sutarday");
     break;
     case 0 :
     System.out.println("today is sunday");
     break;
     default :
     System.out.println("enter only date");
     break;
  }
  }
  else
  {
    System.out.println("enter only date");
  }
  }

}
