import java.io.*;
class demo5
{
    public void check(int a) 
    {
          try
          {
            if(a%2==0)
            System.out.println("even"+a);
            else
            throw new EvenIsNotPresentException("not a right value");
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
           demo5 obj=new demo5();
           obj.check(a);
    }
}
class EvenIsNotPresentException extends Exception
{
    public EvenIsNotPresentException(String x)
    {
          super(x);
    }
}
