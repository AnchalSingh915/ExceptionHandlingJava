import java.io.*;
class demo6
{
    public void twin(int a,int b) 
    {
        int z=0,l=0,u=0,t=0;
          try
          {
            if(a-b==2 || b-a==2)
            {
                l=0;
                for(z=1;z<=a;z++)
                {
                    if(a%z==0)
                    l=l+1;
                }
                if(l==2)
                {
                    u=0;
                    for(z=1;z<=b;z++)
                    {
                        if(b%z==0)
                        u=u+1;
                    }
                    if(u==2)
                    System.out.println("twin prime no.");
                
            
                    else
                    t=1;
                }
                else
                t=1;
            }
            else
            t=1;
            if(t!=1)
            System.out.println("twin prime no.");
            else
             throw new NotTwinPrimeException("not a right value");
          }  
          catch(Exception ge)
          {
            System.out.println(ge);  
          }
    }
    public static void main(String ar[]) throws IOException
    {
       int x=0,y=0;
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("enter the no ");
         x=Integer.parseInt(br.readLine());
         System.out.println("enter the no ");
         y=Integer.parseInt(br.readLine());
           demo6 obj=new demo6();
           obj.twin(x,y);
    }
}
class  NotTwinPrimeException extends Exception
{
    public  NotTwinPrimeException(String a)
    {
          super(a);
    }
}
