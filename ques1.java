import java.util.*;
class ques1
{
    public static void main(String args[])
    {
        int i=0;
        String s="";
        char ch,ch1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        s=sc.nextLine();
        String m[]=s.split("//s+");
        String str;
        String str2;
        for(i=0;i<m.length;i++)
        System.out.println("print the word"+m[i]);
        {
            str2=m[i];
            if(str2.length()>1)
            {
              ch=str2.charAt(0);
              ch1=str2.charAt(str2.length()-1);
              String mid=str2.substring(1,str2.length()-1);
              str=ch1+mid+ch;
            }
            else
            str=str2;
            System.out.print(str+" ");
        }
    }
}                                                                                                  
        
        
                    
                    
                    
                    
                    
                    
                
    
