import java.io.*;
class br4
{
    public static void main(String args[])
    {
        try
        {
          int i=0,j=0,k=0;
          String str="";
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          System.out.println("enter the String");
          str=br.readLine();
          System.out.print(str.charAt(0));
            for(i=0;i<str.length();i++)
            {
                  if(str.charAt(i)==' ')
                      k=k+1;
            }
            for(i=0;i<str.length();i++)
            {
               if(str.charAt(i)==' ')
               {
                j=j+1;
                if(j<=k)
                System.out.print(".");
                System.out.print(str.charAt(i+1));
               }
            }
        }
            catch(Exception ge)
            {
              System.out.println(ge);
            }   
    }
}      
