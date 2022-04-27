import org.hibernate.*;
import org.hibernate.cfg.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class MainClasses extends HttpServlet
{
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException
    {
        res.setContentType("text/html");
        PrintWriter out=res.getWriter();
        String name=req.getParameter("name");
        String password=req.getParameter("password");
        Configuration cfg=new Configuration().configure();
        SessionFactory sf=cfg.buildSessionFactory();
        Session ss=sf.openSession();
        Transaction tx=null;
        try
        {
            tx=ss.beginTransaction();
            NewClass n=new NewClass(name, password);
            ss.save(n);
          out.println("Data Save");
            tx.commit();
            
        }
        catch(Exception e)
        {
         out.println(""+e);
        }
        
    }
    
}
