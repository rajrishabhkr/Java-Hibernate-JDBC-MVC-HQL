import org.hibernate.*;
import org.hibernate.cfg.*;
public class EmployeeMain {
    public static void main(String[] args) {
        Configuration cfg=new Configuration().configure();
        SessionFactory sf=cfg.buildSessionFactory();
        Session ss=sf.openSession();
        Transaction tx=null;
        try
        {
            tx=ss.beginTransaction();
            Employee e1=new Employee("Ankita","Anand",30000);
            Employee e2=new Employee("Simaran","Kumari",20000);
            ss.save(e1);
            ss.save(e2);
            tx.commit();
            ss.close();
        }
        catch(Exception e)
        {
            System.out.println(""+e);
            
        }
    }
    
}
