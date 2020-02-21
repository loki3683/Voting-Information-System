package module2;
import java.io.*;

public class ReadFile
{
      public static void readFile() throws IOException
      {
             FileInputStream fis=new FileInputStream("candidate");
             ObjectInputStream oips=new ObjectInputStream(fis);
             DetailsOfCandidate d=null;
             try
             {
                      while((d=( DetailsOfCandidate)oips.readObject())!=null)
                             System.out.println(d);
              }
              catch(Exception e)
              {}
                fis.close();
                 oips.close();
          }
          public static void candidateFile() throws IOException
        {
             FileInputStream fis=new FileInputStream("candidate");
             ObjectInputStream oips=new ObjectInputStream(fis);
             DetailsOfCandidate d=null;
             try
             {
                      while((d=( DetailsOfCandidate)oips.readObject())!=null)
                             System.out.println(d.Cname+"\t"+d.Cvote);
              }
              catch(Exception e)
              {}
                fis.close();
                 oips.close();
          }
}
