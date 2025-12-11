import java.io.*;
class br2
{
    public static void main(String args[]) throws IOException
    {
          try
          {
        int x=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the no.");
        x=Integer.parseInt(br.readLine());
        if(x%7==0||x%10==7)
        System.out.println("buzz"+x);
        else
        System.out.println("non buzz"+x);
        }
         catch(Exception ge)
         {
             System.out.println(ge);
            }
         }
    }

        
        
