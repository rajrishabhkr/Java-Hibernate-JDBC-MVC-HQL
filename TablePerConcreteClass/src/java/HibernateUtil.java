import org.hibernate.cfg.*;
import org.hibernate.*;
public class HibernateUtil
{
  static SessionFactory sf=null;
  static
  {	try
   {
     Configuration cfg=new Configuration().configure();
     sf=cfg.buildSessionFactory();
   }
   catch(Exception e)	{
      e.printStackTrace();
   }
  }
  public static SessionFactory getSessionFactory()
  {
    return sf;
  }	}

