import module1.DetailsOfVoter;
import module1.DeleteVoterData;
import module1.EditVoterFile;
import module1.ReadFile;
import java.io.*;
import java.util.*;

class UsageModule1
{
       public static void main(String args[])throws IOException
       {
               Scanner sc=new Scanner(System.in);
               System.out.println("Enter the choice :");
               System.out.println("1.Store Voter Details");
               System.out.println("2.Edit Voter Details");
               System.out.println("3.Delete Voter Details");
               System.out.println("4.Report of voter Details");
               int choice=sc.nextInt();
               do
               {
                try{
               switch(choice)
               {
                     case 1:System.out.println("Enter how many voters");
                            int n=sc.nextInt();
                             
                            FileOutputStream fout=new FileOutputStream("vote");
                            ObjectOutputStream oops=new ObjectOutputStream(fout);
                            
                            DetailsOfVoter x=null;
                            for(int i=0;i<n;i++)
                            {
                                  x=DetailsOfVoter.getVoterDetails();
                                  oops.writeObject(x);
                            }
                            break;
                      case 2:
                             System.out.println("Enter the previous details you have given");
                             DetailsOfVoter newcontent=null;
                             DetailsOfVoter oldcontent=null;

                             oldcontent=DetailsOfVoter.getVoterDetails();
                             System.out.println("Enter the new details you have  to give");
                             newcontent=DetailsOfVoter.getVoterDetails();

                             EditVoterFile.modifyVoterDetail(oldcontent,newcontent);
                             

                             break;
                     case 3:   System.out.println("Enter the details you have to delete");
                              DetailsOfVoter deletecontent=null;
	           deletecontent=DetailsOfVoter.getVoterDetails();

                             DeleteVoterData.modifyVoterDetail(deletecontent);
                             break;
                      case 4:ReadFile.readFile();
                              break;
                      default:break;
                     }
                     }
                    
                      catch(InputMismatchException e)
                      {}
                       System.out.println("Enter the choice :");
                      choice=sc.nextInt();
                   }while(true);
        }
}
