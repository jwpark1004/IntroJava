public class Student
{
   private int grade; //0-freshman 1-sophomore 2-junior 3-senior
   private String name; //first name
   private int sex; //0-male 1-female
   private double gpa; 
   public Student()
   { 
      grade=0;
      name="John";
      sex=0;
      gpa=3.0;
   }
   public Student(int mygrade, String myname, int mysex, double mygpa)
   {
      grade=mygrade;
      name=myname;
      sex=mysex;
      gpa=mygpa;
   }
   public void changegrade(int differentgrade)
   {
   grade=differentgrade;
   }
   public void changegpa (double differentgpa)
   {
   gpa=differentgpa;
   }
   public int getgrade()
   {
      return grade;
     }
   public String getname()
   {
      return name;
   }
   public int getsex()
   {
      return sex;
   }
   public double getgpa()
   {
      return gpa;
   }
   public boolean compare(Student b)
   {
   return gpa>b.getgpa();
   }
}
