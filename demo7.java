import java.io.*;
class demo7
{
    public void spy(int x) 
    {
        int y=0,z=1,a=0;
          try
          {
                for(;x>0;)
                {
                    a=x%10;
                    y=y+a;
                    z=z*a;
                    x=x/10;
                }
                if(z==y)
                System.out.println("spy no.");
                else
                throw new NotSpyNumberException("not a right value");   
          }  
          catch(Exception ge)
          {
            System.out.println(ge);  
          }
    }
    public static void main(String ar[]) throws IOException
    {
       int p=0;
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("enter the no ");
         p=Integer.parseInt(br.readLine());
           demo7 obj=new demo7();
           obj.spy(p);
    }
}
class  NotSpyNumberException extends Exception
{
    public NotSpyNumberException(String x)
    {
          super(x);
    }
}
