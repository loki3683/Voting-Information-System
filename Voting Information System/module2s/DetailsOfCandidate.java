package module2;

import java.io.*;

public class DetailsOfCandidate  implements Serializable
{
        //variables
        public String Cname,Cconstituency,Cdistrict;
        public int Cslno,Cvote;
        
      
        //parametorised constructor
         
        DetailsOfCandidate(String  Cname,String Cconstituency,String Cdistrict,int Cslno,int Cvote)
         {
                this. Cname= Cname;
                this.Cconstituency=Cconstituency;
                this.Cdistrict=Cdistrict;
                this.Cslno=Cslno;
                this.Cvote=Cvote;
         }

         //display Candidatedetails
         @Override
         public String toString()
          {
               return Cslno+"\t"+Cname+"\t"+Cconstituency+"\t"+Cdistrict+"\t"+Cvote;
          }

          public static DetailsOfCandidate getCandidateDetails() throws IOException
          {
                DataInputStream dis=new DataInputStream(System.in);
                System.out.print("Enter slno:"); 
                int Cslno=Integer.parseInt(dis.readLine());
                System.out.print("Enter Candidate name:");
                String Cname=dis.readLine();
                System.out.print("Enter Candidate District:"); 
                String Cdistrict=dis.readLine();
                System.out.print("Enter Candidate constituency:"); 
                String Cconstituency=dis.readLine();
                int Cvote=0;
                
               
            
                //create DetailsOfCandidate object
                DetailsOfCandidate  x= new DetailsOfCandidate(Cname,Cconstituency,Cdistrict,Cslno,Cvote);
                return x;
              }
}
                