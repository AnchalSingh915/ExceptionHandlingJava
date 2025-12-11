import java.io.*;
class demo
{
    public void throwexp(int x) throws Exception
    {
          try
          {
            if(x>50)
              System.out.println("pass");
            else
             throw new NullPointerException();
          }  
          catch(Exception anchal)
          {
            System.out.println(anchal);  
          }
    }
    public static void main(String ar[])
    {
       int a=0;
       try
       {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("enter the no");
       a=Integer.parseInt(br.readLine());
       demo obj=new demo();
       obj.throwexp(a);
    }
    catch(Exception kajal)
    {
        System.out.println(kajal);
    }
    }
}
       
    