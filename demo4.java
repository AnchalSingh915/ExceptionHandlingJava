import java.io.*;

class demo4
{
    public void check(int a) 
    {
          try
          {
            if(a>33)
            System.out.println("pass"+a);
            else
            throw new FailedInExamException("invalid value");
          }  
          catch(Exception ge)
          {
            System.out.println(ge);  
          }
    }
    public static void main(String ar[]) throws IOException
    {
       int a=0;
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("enter the no ");
         a=Integer.parseInt(br.readLine());
      
           demo4 obj=new demo4();
           obj.check(a);
         
    }
}
class FailedInExamException extends Exception
{
    public FailedInExamException(String x)
    {
          super(x);
    }
}