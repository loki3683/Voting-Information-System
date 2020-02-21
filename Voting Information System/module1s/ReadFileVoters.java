package module1;
import java.io.*;

public class ReadFileVoters
{
      public static void readFile() throws IOException
      {
             FileInputStream fis=new FileInputStream("vote");
             ObjectInputStream oips=new ObjectInputStream(fis);
             DetailsOfVoter d=null;
             try
             {
                      while((d=( DetailsOfVoter)oips.readObject())!=null)
                             System.out.println(d);
              }
              catch(Exception e)
              {
              }
                fis.close();
                 oips.close();
          }
}
