import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
class charat
{
  public static void main(String[] args) {


  int i,t;
  Scanner scan = new Scanner(System.in);
//  t=scan.nextInt();
  //String myString="This is my String";
  //myString = myString.replaceAll("\\s+","");
  String s = scan.next();

  char[] myCharArray=s.toCharArray();//to break a string into component of characters
  //String even;
  //String odd;

  //char even,odd;
    int j=0;
    int k=0;
    char[] letters = new char[10];
    char[] words = new char[10];
  for(i=0;i<s.length();i++)
  {
      if(i%2==0)
    {
      //  System.out.println("even:");
      //  System.out.println("x"+"["+i+"]"+"="+myCharArray[i]);
    //  myCharArray[i]+=myCharArray[i];
  //    System.out.println("Odd:");
      letters[j]=myCharArray[i];
//      System.out.print(""+letters[j]);
      j++;

    }
    else
    {
        //System.out.println("odd:");
        //System.out.println("x"+"["+i+"]"+"="+myCharArray[i]);
    //    myCharArray[i]+=myCharArray[i];
    //    int k=0;
    //    System.out.println("Even:");
        words[k]= myCharArray[i];
  //      System.out.println(" "+words[k]);
        k++;
    }

  }
  for(j=0;j<s.length();j++)
  {
      System.out.print(""+letters[j]);
  }
  for(k=0;k<s.length();k++)
  {
      System.out.print(""+words[k]);
  }

//  System.out.println("Even:"+letters);
//  System.out.println("Odd:"+words);

  System.out.println("");
}
}
