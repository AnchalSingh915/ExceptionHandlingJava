import java.io.*;
class demo2
{
    public void throwexp(int x) throws Exception
    {
          try
          {
            if(x>=48 || x<=57)
              System.out.println("integer");
            else
             throw new NumberFormatException();
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
       demo2 obj=new demo2();
       obj.throwexp(a);
    }
    catch(Exception kajal)
    {
        System.out.println(kajal);
    }
    }
}
       
    
