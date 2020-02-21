package module3;
import module2.DetailsOfCandidate;
import java.io.*;
import java.util.*;

public class VoteIncrement
{
        public static void IncreaseVote(int choice)throws IOException
       {
               ArrayList<DetailsOfCandidate> a=new ArrayList<DetailsOfCandidate>();
               DetailsOfCandidate z=null;
               try
               {
               FileInputStream fis=new FileInputStream("candidate");
               ObjectInputStream oips = new ObjectInputStream(fis);
               while((z=(DetailsOfCandidate)oips.readObject())!=null)
               {
                    a.add(z);
               }
               fis.close();
               oips.close();
               }
               catch(Exception e)
               {
               }
               
               for(DetailsOfCandidate x:a)
               {
                     if(x.Cslno==choice)
                    {
                           x.Cvote++;
                           break;
                     }
                }
               FileOutputStream fout=new FileOutputStream("candidate");
               ObjectOutputStream oops=new ObjectOutputStream(fout);
               try
               {
               
              for(DetailsOfCandidate x:a)
              {
                     oops.writeObject(x);	     
              }
               }
               catch(Exception e)
                {}
              fout.close();
              oops.close();  
       }
}