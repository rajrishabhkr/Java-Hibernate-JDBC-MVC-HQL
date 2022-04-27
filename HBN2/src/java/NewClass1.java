import org.hibernate.*;
import org.hibernate.cfg.*;
public class NewClass1
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
            NewClass s1=(NewClass)ss.get(NewClass.class,2);
            ss.delete(s1);               
            tx.commit();
            System.out.println("Data deleted successfully..");          
        }
        catch(Exception e)
        {
            System.out.println(""+e);
        }
        
    }
    
}