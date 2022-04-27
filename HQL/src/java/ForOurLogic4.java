import org.hibernate.*;
import org.hibernate.cfg.*;
public class ForOurLogic4
{
    public static void main(String[] args)
    {
        Configuration cfg = new Configuration().configure();
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Query qry = session.createQuery("update Product p set p.proName=? where p.productId=1");
        qry.setParameter(0,"Land");
        int res = qry.executeUpdate();
        System.out.println("Command successfully executed....");
        System.out.println("Numer of records effected due to update query "+res);
        session.close();
        factory.close();
    }
}