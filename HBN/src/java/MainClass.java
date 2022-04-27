import org.hibernate.*;
import org.hibernate.cfg.*;
public class MainClass 
{
    public static void main(String[] args)
    {
        Configuration cfg=new Configuration().configure();
        SessionFactory sf=cfg.buildSessionFactory();
        Session ss=sf.openSession();
        Transaction tx=null;
        try
        {
            tx=ss.beginTransaction();
            NewClass n=new NewClass("Suraj","8543");
            ss.save(n);
            System.out.println("Data Save");
            tx.commit();
        }
        catch(Exception e)
        {
            System.out.println(" "+e);
        }
    }
}