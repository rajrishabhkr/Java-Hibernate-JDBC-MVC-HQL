import java.util.Iterator;
import java.util.List;
import org.hibernate.*;
import org.hibernate.cfg.*;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
public class EmployeeFetchCre
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
            Criteria cr=ss.createCriteria(Employee.class);
            //cr.add(Restrictions.gt("salary", 2000));
            //cr.add(Restrictions.lt("salary",7000));
            //cr.add(Restrictions.le("salary",7000));
            //cr.add(Restrictions.ge("salary",7000));
            //cr.add(Restrictions.ne("salary",7000));
            //cr.add(Restrictions.eq("salary",7000));
            cr.add(Restrictions.between("salary", 5000, 10000));
            ///cr.add(Restrictions.like("salary",7000));
            List employees = cr.list();

            for (Iterator iterator =employees.iterator(); iterator.hasNext();)
            {
                Employee employee = (Employee) iterator.next(); 
                System.out.print("First Name: " + employee.getFirstname()); 
                System.out.print("  Last Name: " + employee.getLastname()); 
                System.out.println("  Salary: " + employee.getSalary());             
                //cr.add(Restrictions.gt("salary", 2000));           
            }
            cr.setProjection(Projections.sum("salary"));
            List totalSalary = cr.list();
            System.out.println("Total Salary: " + totalSalary.get(0) );
         
            cr.setProjection(Projections.rowCount());
            List rowCount = cr.list();
            System.out.println("Total Count: " + rowCount.get(0) );         
            tx.commit();
        }
        catch(Exception e)
        {
            System.out.println(""+e);
        }
    }    
}
