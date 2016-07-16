import java.io.*;
import java.util.Scanner;
class Person
{
  int age;
  Person(int initialage)
  {

/*    if((initialage<=-6) && (initialage>=31))
    {
      System.out.println("error not satisfying the boundaray conditions");
      System.exit(0);
      System.out.println("Im in block 1:");
    }
*/
    if(initialage<0)
    {
      age=0;
  //    System.out.println("I'm in block 2");
      System.out.println("Age is not valid, setting age to 0.");

      amIOld(age);
      initialage_me(age);

    }
    else
    {
      age= initialage;

      amIOld(age);
      initialage_me(age);

    }
  }
  void initialage_me(int age)
  {
    for(int i=0;i<=2;i++)
    {
      age = age+1;

    }

  //  System.out.println("I'm in block 3 age:"+age);

    amIOld(age);//after incrementing their age by 3
    System.out.println("\n");

  }
  void amIOld(int age)
  {
    if(age<13)
    {
      System.out.println("You are young.");
    //  System.out.println("I'm in block 4");
    }
    else if(age>=13 && age<18)
    {
        System.out.println("You are a teenager.");
    //      System.out.println("I'm in block 5");
    }
    else
    {
        System.out.println("You are old.");
  //        System.out.println("I'm in block 6");
    }
  }
}

class person_age
{
  public static void main(String[] args) {


    int i;
    int t;
    int no[] = new int[10];
    Scanner s = new Scanner(System.in);
  //  Scanner s = new Scanner(System.in);

    //  Person pop = new Person();
//   System.out.println("");  System.out.println("please enter the no:");
  //  System.out.println("please enter the no:");
      t=s.nextInt();

    for(i=0;i<t;i++)
    {

        //please enter the corresponding no
        no[i] = s.nextInt(); //getting the no


    }

  //   Person dot = new Person(t);


    for(i=0;i<t;i++)
    {
        //int j = no[i];
          Person sop = new Person(no[i]);
    }

}
}
