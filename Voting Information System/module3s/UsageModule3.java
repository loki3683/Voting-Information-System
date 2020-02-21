import module3.VoteIncrement;
import module3.Polling;
import module3.PrintCandidate;
import module1.DetailsOfVoter;
import java.io.*;
import java.util.*;
import module2.ReadFile;

class Usagemodule3
{
         public static void main(String args[])throws IOException
         {
                 Scanner sc=new Scanner(System.in);
                 System.out.println("1.Welcome to polling");
                 System.out.println("2.report the polled votes constituency wise");
                 System.out.println("3.report the polled votes candidates wise");
                 System.out.println("4.report the polled votes district wise");
                 System.out.print("Enter the choice");
                  int choice;
                  choice=sc.nextInt();
                 do
                 {
                         switch(choice)
                         {
                               case 1:System.out.println("Ready to poll");
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
                                        break;
                              case 2:ReadFile.readFile();
                                          break;
                              case 3:ReadFile.candidateFile();
                                          break;
                              }
                              System.out.println("Enter the Choice");
                              choice=sc.nextInt();
                  }
                  while(choice!=5);
            }
}
                                
                               