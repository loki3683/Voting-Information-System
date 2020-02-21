package module1;
import java.io.*;
 
public class EditVoterFile
{    
    public static void modifyVoterDetail(DetailsOfVoter oldString,DetailsOfVoter newString)throws IOException
    {
          FileInputStream fis=new FileInputStream("vote");
          ObjectInputStream ooip=new ObjectInputStream (fis);
        
          FileOutputStream fout=new FileOutputStream("vote2");
          ObjectOutputStream  oop=new  ObjectOutputStream (fout);

          DetailsOfVoter x=null;
          try
          {
          while((x=(DetailsOfVoter)ooip.readObject())!=null)
           {
                  if(oldString.votername.equals(x.votername)&&oldString.constituency.equals(x.constituency)&&oldString.district.equals(x.district)&&oldString.gender.equals(x.gender)&&oldString.age==x.age)
                   {
                            oop.writeObject(newString);
                   }
                  else
                  {
                             oop.writeObject(x);
                   }
            }
             }
            catch(Exception e)
            {
            }
            fis.close();
            fout.close();
            ooip.close();
            oop.close();      
           FileInputStream fis1=new FileInputStream("vote2");
           ObjectInputStream ooip1=new ObjectInputStream (fis1);
        
          FileOutputStream fout1=new FileOutputStream("vote");
          ObjectOutputStream  oop1=new  ObjectOutputStream (fout1); 
          DetailsOfVoter x1=null;
          try
          {
            while((x1=(DetailsOfVoter)ooip1.readObject())!=null)
           {
                  oop1.writeObject(x1);
            }
           }
            catch(Exception e)
            {
            }
            fis1.close();
            fout1.close();
            ooip1.close();
            oop1.close();  
    }
  }