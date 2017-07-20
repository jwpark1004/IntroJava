public class Test
{
   public static void main(String[] arqs)
   {
      Student a=new Student();
      Student b=new Student(0, "Bob", 0, 3.5);
      a.changegpa(4.0);
      b.changegrade(1);
      double c=b.getgpa();
      System.out.println(c);
      boolean smarter=a.compare(b);
      System.out.println(smarter);
    
   }
}

