import module2.DetailsOfCandidate;
import module2.DeleteCandidateData;
import module2.EditCandidateFile;
import module2.ReadFile;
import java.io.*;
import java.util.*;

class UsageModuleCandidate
{
       public static void main(String args[])throws IOException
       {
               Scanner sc=new Scanner(System.in);
               System.out.println("Enter the choice :");
               System.out.println("1.Store Candidate Details");
               System.out.println("2.Edit Candidate Details");
               System.out.println("3.Delete Candidate Details");
               System.out.println("4.Report of Candidate Details");
               int choice=sc.nextInt();
               do
               {
                try{
               switch(choice)
               {
                     case 1:System.out.println("Enter how many Districts");
                            int n=sc.nextInt();
                             System.out.println("Enter how many Constituencies in eachDistricts");
                             int n1=sc.nextInt();
                            FileOutputStream fout=new FileOutputStream("candidate");
                            ObjectOutputStream oops=new ObjectOutputStream(fout);
                            
                            DetailsOfCandidate x=null;
                            for(int i=0;i<n*n1*2;i++)
                            {
                                  x=DetailsOfCandidate.getCandidateDetails();
                                  oops.writeObject(x);
                            }
                            break;
                      case 2:
                             System.out.println("Enter the previous details you have given");
                             DetailsOfCandidate newcontent=null;
                             DetailsOfCandidate oldcontent=null;

                             oldcontent=DetailsOfCandidate.getCandidateDetails();
                             System.out.println("Enter the new details you have  to give");
                             newcontent=DetailsOfCandidate.getCandidateDetails();

                             EditCandidateFile.modifyCandidateDetail(oldcontent,newcontent);
                             

                             break;
                     case 3:   System.out.println("Enter the details you have to delete");
                              DetailsOfCandidate deletecontent=null;
	           deletecontent=DetailsOfCandidate.getCandidateDetails();

                             DeleteCandidateData.modifyCandidateDetail(deletecontent);
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
