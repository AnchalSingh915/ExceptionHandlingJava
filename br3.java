import java.io.*;
class br3
{
    public static void main(String args[]) throws IOException
    {
        try
        {
           int x=0,y,z=0,l=0,u=0;
           BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
           System.out.println("enter the first no.");
           x=Integer.parseInt(br.readLine());
           System.out.println("enter the second no.");
           y=Integer.parseInt(br.readLine());
             if(x-y==2 || y-x==2)
             {
                 l=0;
                  for(z=1;z<=x;z++)
                  {
                    if(x%z==0)
                    l=l+1;
                  }
               if(l==2)
               {
                u=0;
                for(z=1;z<=y;z++)
                {
                    if(y%z==0)
                    u=u+1;
                }
                if(u==2)
                 System.out.println("twin prime no.");
                else
                 System.out.println("nontwin prime no.");
               }
               else
                System.out.println("nontwin prime no.");
             }
             else
              System.out.println("nontwin prime no.");
        }    
            catch(Exception ge)
            {
              System.out.println(ge);
            }
    }
}

        
        
