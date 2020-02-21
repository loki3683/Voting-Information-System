package module3;
import java.io.*;
import module2.DetailsOfCandidate;
import module1.DetailsOfVoter;

public class PrintCandidate
{
      public static void Print(DetailsOfVoter y)throws IOException
      {
             FileInputStream fis=new FileInputStream("candidate");
             ObjectInputStream oips=new ObjectInputStream(fis);
             
             DetailsOfCandidate x=null;
           try
          {
          while((x=(DetailsOfCandidate)oips.readObject())!=null)
           {
                  if(y.constituency.equals(x.Cconstituency) &&   y.district.equals(x.Cdistrict))
                             System.out.println(x);
           }
           }
            catch(Exception e)
            {}
       }
}