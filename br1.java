import java.io.*;
class br1
{
    public static void main(String args[]) throws IOException
    {
          try
          {
        int x=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the no.");
        x=Integer.parseInt(br.readLine());
        if(x%2==0)
        System.out.println("even"+x);
        else
        System.out.println("odd"+x);
        }
         catch(Exception ge)
         {
             System.out.println(ge);
            }
         }
    }

        
        