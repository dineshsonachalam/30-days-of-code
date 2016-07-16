import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
class square
{
    public static void main(String[] args) {
      int i,t;
      int p[]=new int[100];
      int a[]=new int[100];
      //get the no of test cases
      Scanner scan = new Scanner(System.in);
      t=scan.nextInt();
      System.out.println("Enter the perimeter and area for the following?");
      for(i=0;i<t;i++)
      {
      //  if(a[i]>0 && p[i]>0 && a[i]<9999999 && p[i]<9999999)
        //{
        p[i]=scan.nextInt();
        a[i]=scan.nextInt();
      //  }
      //  System.out.println("");
      /*
        else
        {
          System.exit(0);
        }
      */
      }

      //checking p=4a to say its a square or its a rectangle

      for(i=0;i<t;i++)
      {
        if(a[i]>=1 && p[i]>=1 && a[i]<9999999 && p[i]<9999999)
        {
         if((p[i])==(4*a[i]))
          {
              System.out.println("Square");
          }
          else
          {
              System.out.println("Rectangle");
          }
        }
        else
        {
            System.out.println("Error");
        }
      }
    }
}
