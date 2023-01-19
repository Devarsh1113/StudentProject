package printstudentdetails; 
/* 
Store and Print Student Details.
View Class or User Interaction Class.
*/

public class PrintStudentDetails {
    
    public static void main(String[] args)
    {
       //store and print 3 student details.
       Student[]list = new  Student [3]; 
       Student s1 = new Student(); // object creation
       Student s2 = new Student();
       Student s3 = new Student();
       s1.setName("Devarsh");
       s1.setSID(19);
       s2.setName("Aryan");
       s2.setSID(18);
       s3.setName("Vansh");
       s3.setSID(20);
       
       list[0] = s1;
       list[1] = s2;
       list[2] = s3;
        for (int i = 0; i <list.length; i++)
        {
            System.out.println(list[i].getName() + " " + list[i].getSID());
            
        }
    }
    
}
