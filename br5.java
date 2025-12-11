import java.io.*;
class br5
{
    public static void main(String args[])
    {
        try
        {
          int i=0,l=0,k=0;
          String ori="",rev="";
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          System.out.println("enter the String");
          ori=br.readLine();
          l=ori.length();
            for(i=l-1;i>=0;i--)
                rev=rev+ori.charAt(i);
                if(ori.equals(rev.trim()))
                System.out.println("palindrome");
                else
                System.out.println("not palindrome");
        }
            catch(Exception ge)
            {
              System.out.println(ge);
            }   
    }
}      
