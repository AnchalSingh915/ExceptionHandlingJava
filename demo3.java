import java.io.*;
class demo3
{
    public void throwexp(int x) throws Exception
    {
          try
          {
            if(x<10)
            System.out.println("only 10 position are present in the array");
            else
            throw new ArrayIndexOutOfBoundsException();
          }  
          catch(Exception anchal)
          {
            System.out.println(anchal);  
          }
    }
    public static void main(String ar[])
    {
       int i=0;
       try
       {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("enter the no of elements");
         i=Integer.parseInt(br.readLine());
         demo3 obj=new demo3();
         obj.throwexp(i);
         }
         catch(Exception kajal)
         {
           System.out.println(kajal);
         }
    }
}
       
    
