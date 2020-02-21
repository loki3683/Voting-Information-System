package module1;

import java.io.*;

public class DetailsOfVoter  implements Serializable
{
        //variables
        public String votername,constituency,district;
        public String gender;
        public int age;
      
        //parametorised constructor
         
        DetailsOfVoter(String votername,String constituency,String district,String gender,int age)
         {
                this.votername=votername;
                this.constituency=constituency;
                this.district=district;
                this.gender=gender;
                this.age=age;
         }

         //display voter details
         @Override
         public String toString()
          {
               return votername+"\t"+constituency+"\t"+district+"\t"+gender+"\t"+age;
          }

          public static DetailsOfVoter getVoterDetails() throws IOException
          {
                DataInputStream dis=new DataInputStream(System.in);
                System.out.print("Enter voter name:");
                String votername=dis.readLine();
                System.out.print("Enter District:"); 
                String district=dis.readLine();
                System.out.print("Enter constituency:"); 
                String constituency=dis.readLine();
                System.out.print("Enter gender:");  
                String gender=dis.readLine();
                System.out.print("Enter age:"); 
                int age=Integer.parseInt(dis.readLine());
               
            
                //create DetailsOfVoter object
                DetailsOfVoter  x= new DetailsOfVoter(votername,constituency,district,gender,age);
                return x;
              }
}
                