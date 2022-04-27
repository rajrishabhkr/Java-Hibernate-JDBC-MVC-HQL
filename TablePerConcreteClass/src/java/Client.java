import org.hibernate.*;
public class Client
{
        public static void main(String as[])
        {
            Transaction tx=null;
            try
            {
                SessionFactory sf=HibernateUtil.getSessionFactory();
                Session ses=sf.openSession();
                tx=ses.beginTransaction();
                Student s1=new Student("kishori pd","kishori@gmail.com");
                NewStudent s2=new NewStudent("rajendra pd","rajen101@yahoo.com","B.Ed","987654321");
                ses.save(s1);
                ses.save(s2);
                tx.commit();
                ses.close();
            }
            catch(Exception e)
            {
                System.out.println(""+e);
            }
        }
}
