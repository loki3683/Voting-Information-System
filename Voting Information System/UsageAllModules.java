import module1.*;
import module2.*;
import module3.*;
import java.io.*;
import java.util.*;
import module1.ReadFileVoters;



class UsageAllModules
{
       public static void main(String args[])throws IOException
       {
               Scanner sc=new Scanner(System.in);
               System.out.println("Enter in to the Voting System....");
               
               int n;
              
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
                            n=sc.nextInt();
                             
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
                      case 4:ReadFileVoters.readFile();
                              break;
                      default:break;
                     }
                     }
                    
                      catch(InputMismatchException e)
                      {}
                       System.out.println("Enter the choice :");
                      choice=sc.nextInt();
                   }while(true);
                                      
               System.out.println("Enter the choice :");
               System.out.println("1.Store Candidate Details");
               System.out.println("2.Edit Candidate Details");
               System.out.println("3.Delete Candidate Details");
               System.out.println("4.Report of Candidate Details");
               choice=sc.nextInt();
               do
               {
                try{
               switch(choice)
               {
                     case 1:System.out.println("Enter how many Districts");
                            int n2=sc.nextInt();
                             System.out.println("Enter how many Constituencies in eachDistricts");
                             int n1=sc.nextInt();
                            FileOutputStream fout=new FileOutputStream("candidate");
                            ObjectOutputStream oops=new ObjectOutputStream(fout);
                            
                            DetailsOfCandidate x=null;
                            for(int i=0;i<n2*n1*2;i++)
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
                 

                 for(int j=0;j<n;j++)
                 {
                         System.out.println("Ready to poll");x
                         DetailsOfVoter x=null;
                        x=DetailsOfVoter.getVoterDetails();
                         if(Polling.pollingRegisterCheck(x))
                          {
                                   System.out.println("Ok..");
                                   PrintCandidate.Print(x);
                                    int val;
                                    System.out.println("Enter the candidate sl no to vote:");
                                    val=sc.nextInt();
                                    VoteIncrement.IncreaseVote(val);
                                    System.out.println("You Succesfully voted....");
                                     System.out.println("Thank you for encouraging ....");
                          }
                          else
                          {
                                 System.out.println("Candidate is note eligible to vote");
                          }
               if(sc.nextInt()==1)
               {
                     break;
               }
              }
                  ReadFile.readFile();
                  ReadFile.candidateFile();
      }
 }
          