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

//      amIOld(age);
  //    initialage_me(age);

    }
    else
    {
      age= initialage;

  //    amIOld(age);
  //    initialage_me(age);

    }
  }

  void yearPasses()
  {
  //  System.out.println("I'm in block 3 age:"+age);

  //  amIOld(age);//after incrementing their age by 3
    age =age+1;
    //System.out.println("\n");

  }
  void amIOld()
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
  Scanner sc = new Scanner(System.in);
  int T = sc.nextInt();
  for (int i = 0; i < T; i++) {
    int age = sc.nextInt();
    Person p = new Person(age);
    p.amIOld();
    for (int j = 0; j < 3; j++) {
      p.yearPasses();
    }
    p.amIOld();
    System.out.println();
      }
  sc.close();
  }
}
