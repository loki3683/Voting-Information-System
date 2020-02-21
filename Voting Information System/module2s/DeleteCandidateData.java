package module2;
import java.io.*;
 
public class DeleteCandidateData
{    
    public static void modifyCandidateDetail(DetailsOfCandidate oldString)throws IOException
    {
          FileInputStream fis=new FileInputStream("candidate");
          ObjectInputStream ooip=new ObjectInputStream (fis);
        
          FileOutputStream fout=new FileOutputStream("candidate2");
          ObjectOutputStream  oop=new  ObjectOutputStream (fout);

          DetailsOfCandidate x=null;
          try
          {
          while((x=(DetailsOfCandidate)ooip.readObject())!=null)
           {
                  if(oldString.Cname.equals(x.Cname)&&oldString.Cconstituency.equals(x.Cconstituency)&&oldString.Cdistrict.equals(x.Cdistrict)&&oldString.Cslno==x.Cslno)
                   {
                            continue;
                   }
                  else
                  {
                             oop.writeObject(x);
                   }
            }
             }
            catch(Exception e)
            {}
            fis.close();
            fout.close();
            ooip.close();
            oop.close();      
           FileInputStream fis1=new FileInputStream("candidate2");
           ObjectInputStream ooip1=new ObjectInputStream (fis1);
        
          FileOutputStream fout1=new FileOutputStream("candidate");
          ObjectOutputStream  oop1=new  ObjectOutputStream (fout1); 
          DetailsOfCandidate x1=null;
          try
          {
            while((x1=(DetailsOfCandidate)ooip1.readObject())!=null)
           {
                  oop1.writeObject(x1);
            }
           }
            catch(Exception e)
            {}
            fis1.close();
            fout1.close();
            ooip1.close();
            oop1.close();  
    }
  }