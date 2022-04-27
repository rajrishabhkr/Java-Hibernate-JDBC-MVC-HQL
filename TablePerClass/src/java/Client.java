import org.hibernate.*;
import org.hibernate.cfg.*;
public class Client
{
  public static void main(String as[])
  {
    
    try
    {
      Configuration cfg=new Configuration().configure();
      SessionFactory sf=cfg.buildSessionFactory();
      Session ses=sf.openSession();
      Transaction tx=ses.beginTransaction();
      Student s1=new Student("Raja","raja@gmail.com");
      NewStudent s2=new NewStudent("Rohit","rohit@gmail.com","Bca","100");
      NewStudent s3=new NewStudent("Rahul","rahul@gmail.com","Bcom","999");
      ses.save(s1);
      ses.save(s2);
      ses.save(s3);
      tx.commit();
      ses.close();
      
//      Student s1=(Student)ses.load(Student.class, 1);
//        System.out.println(""+s1.getEmail());
//        System.out.println(""+s1.getSname());
    }
    catch(Exception e)
    {
         System.out.println(""+e);
    }
  }
}