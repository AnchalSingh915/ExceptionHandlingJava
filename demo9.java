import java.io.*;
class demo9
{
    public void throwexp(int x) throws Exception
    {
          try
          {
            if(x>50)
              System.out.println("pass");
            else
             throw new IOException();
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
       demo9 obj=new demo9();
       obj.throwexp(a);
    }
    catch(Exception kajal)
    {
        System.out.println(kajal);
    }
    }
}
       
    
