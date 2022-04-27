import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.*;
public class ForOurLogic0
{
    public static void main(String[] args)
    {
        Configuration cfg = new Configuration().configure();
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();        
        Query qry = session.createQuery("from Product");
        List l =qry.list();
        Iterator it = l.iterator();
        while(it.hasNext())
        {
            Object o = (Object)it.next();
            Product p = (Product)o;
            System.out.println("Product id : "+p.getProductId());
            System.out.println("Product Name : "+p.getProName());
            System.out.println("Product Price : "+p.getPrice());
        }    
        session.close();
        factory.close();
    }

}