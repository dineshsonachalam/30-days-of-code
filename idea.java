import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
class Idea
{
    public static void main(String[] args)

    {
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
    //  String str = "12 hi when 8 and 9";
      str=str.replaceAll("[\\D]+"," ");
      String[] numbers=str.split(" ");
      int sum = 0;
            for(int i=0;i<numbers.length;i++)
          {

            sum+=Integer.parseInt(numbers[i]);
          }
          System.out.println("Sum:"+sum);
    }
}
