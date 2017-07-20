public class Teacher
{
   private String name;
   private int students;
   private int classes;
   private String favsubject;
   private Student favstudent;
   public Teacher()
   {
      name="Karl";
      students=20;
      classes=3;
      favsubject="math";
      Student a = new Student();
      favstudent=a; 
   
   }  
   public Teacher(String tname, int tstudents, int tclasses, String tfavsubject, Student tfavstudent)
   {
      name=tname;
      students=tstudents;
      classes=tclasses;
      favsubject=tfavsubject;
      favstudent=tfavstudent;
   }
   public void changestudents(int diffstudents)
   {
      students=diffstudents;
   }
   public void changeclasses(int diffclasses)
   {
      classes=diffclasses;
   }
   public void changefavsubject(String difffavsubject)
   {
      favsubject=difffavsubject;
   }
   public void changefavstudent(Student difffavstudent)
   {
      favstudent=difffavstudent;
   }
   public String getname()
   {
      return name;
   }
   public int getstudents()
   {
      return students;
   }
   public int getclasses()
   {
      return classes;
   }
   public String getsubject()
   {
      return favsubject;
   }
   public Student getstudent()
   {
      return favstudent;
   }
}