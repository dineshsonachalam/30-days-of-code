import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
class charat
{
  public static void main(String[] args) {


  int i;
  String myString="This is my String";
  myString = myString.replaceAll("\\s+","");
  char[] myCharArray=myString.toCharArray();//to break a string into component of characters

  for(i=0;i<myString.length();i++)
  {
      System.out.println("x"+"["+i+"]"+"="+myCharArray[i]);
  }
  System.out.println("");
}
}
