import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.*;

public class ForOurLogic2 {

    public static void main(String[] args)
    {
        Configuration cfg = new Configuration().configure();
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Query qry = session.createQuery("select p.productId from Product p");
        List l =qry.list();
        System.out.println("Total Number Of Records : "+l.size());
        Iterator it = l.iterator();
        while(it.hasNext())
        {
            Integer i = (Integer)it.next();
            System.out.println("Product id : "+i.intValue());
            System.out.println("---------------------------");

        }
        session.close();
        factory.close();
    }

}