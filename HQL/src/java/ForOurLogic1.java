import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.*;
public class ForOurLogic1
{
    public static void main(String[] args)
    {
        Configuration cfg = new Configuration().configure();
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Query qry = session.createQuery("select p.productId,p.proName,p.price from Product p");
        List l =qry.list();
        System.out.println("Total Number Of Records : "+l.size());
        Iterator it = l.iterator();
        while(it.hasNext())
        {
            Object o[] = (Object[])it.next();
            System.out.println("Product id : "+o[0]+"     "+ "Product Name : "+o[1]+"     "+ "Product Price : "+o[2]);
            System.out.println("------------------------------------------------------------------");
        }
        session.close();
        factory.close();
    }

}