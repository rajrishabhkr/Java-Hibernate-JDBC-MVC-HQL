import org.hibernate.*;
import org.hibernate.cfg.*;
public class ForOurLogic3
{
    public static void main(String[] args)
    {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Query qry = session.createQuery("delete from Product p where p.productId=:productid");
        qry.setParameter("productid",3);
        int res = qry.executeUpdate();
        System.out.println("Command successfully executed....");
        System.out.println("Numer of records effected due to delete query "+res);
        session.close();
        factory.close();
    }

}