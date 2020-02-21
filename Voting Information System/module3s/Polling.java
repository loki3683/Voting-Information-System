package module3;

import module1.DetailsOfVoter;
import java.io.*;

public class Polling
{
       public static boolean  pollingRegisterCheck(DetailsOfVoter x)throws IOException
       {
                   
                   FileInputStream fout=new FileInputStream("vote");
                   ObjectInputStream oops=new ObjectInputStream(fout);
                   boolean k=false;
           try
          {
            
            DetailsOfVoter y=null;
            
          while((y=(DetailsOfVoter)oops.readObject())!=null)
           {
                  if(y.votername.equals(x.votername)&&y.constituency.equals(x.constituency)&&y.district.equals(x.district)&&y.gender.equals(x.gender)&&y.age==x.age)
                   {
                            k=true;
                            break;
                   }
            }
             }
            catch(Exception e)
            {
            }
            
             fout.close();
             oops.close();
             
             
             return k;
       }
}