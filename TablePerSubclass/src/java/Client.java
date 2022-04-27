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
      Session ss=sf.openSession();
      Transaction tx=ss.beginTransaction();
      Student s1=new Student("Rohan","rohan@gmail.com");
      NewStudent s2=new NewStudent("Rahul","rahul@gmail.com","Mcom","999");
      ss.save(s1);
      ss.save(s2);
      tx.commit();
    }
    catch(Exception e)
    {
         System.out.println(""+e);
    }
  }
}