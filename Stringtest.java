public class Stringtest
{
   public static void main(String[] arqs)
   {
      String a = new String("A");
      String b = "A";
      a=a+0+1+2+3+4+5;
      for(int x=0;x<6;x++)
         b+=x;
      System.out.println(a);
      System.out.println(b);    
      boolean compare= a==b;
      boolean c = a.equals(b);
      System.out.println(compare);
      System.out.println(c);  
      String f = a+b;
      System.out.println(f+1);   
      createSubstring("cat", "dog", 1);
      scramble("cat", "dog");
      scrambleTwo("castle", "battle");
   }
   public static void createSubstring(String a, String b, int index)
   {
   
      String c = a.substring(0,index+1);
      String d = c+b;
      System.out.println(d);
   }

   public static void scramble(String a, String b)
   {
      String temp = "";
      for (int x = 0; x<a.length(); x++)
      {
         temp += a.charAt(x);
         temp += b.charAt(x);
      }
      System.out.println(temp);
   }
   
   public static void scrambleTwo(String a, String b)
   {
      String hi = "";
      for (int x =0; x<a.length(); x += 2)
      {
         String c = a.substring(x,x+2);
         String d = b.substring(x,x+2);
         hi += c+d;
      }
      System.out.println(hi);
   }
   
   public static int[] createRandomArray(int length)
   {
      int[] array = new int[length];
      for(int x = 0; x<array.length; x++)
      {
         array[x] = (int)(Math.random()*12);
      }
      for (int x = 0; x<array.length; x++)
      {
         array[x] = array[x]/(int)(Math.random()*5+1);        
      }
      
      
   return array;
   }

}