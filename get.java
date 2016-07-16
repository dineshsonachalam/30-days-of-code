import java.util.Scanner;
class get
{


    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in); //open Scanner
      String s= scan.next();  //read the next token and save it to s
      scan.close();//close Scanner

      System.out.println(s+" "+s);
    }
}
