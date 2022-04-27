import java.io.*;
import org.hibernate.*;
import org.hibernate.cfg.*;
public class UpdateTest
{
    public static void main(String[] args) throws NumberFormatException, IOException
    {
		Configuration cfg=new Configuration().configure();
		SessionFactory f=cfg.buildSessionFactory();
		Session session=f.openSession();
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		Transaction t=session.beginTransaction();
		while(true)
		{
			System.out.println("Enter ID:-");
			int id=Integer.parseInt(b.readLine());
			Simple s=(Simple)session.load(Simple.class,id);
			System.out.println("Current details are:-");
			System.out.println(s.getSimpleName()+"\t"+s.getSimpleInfo());
			System.out.println("Enter Name:-");
			String n=b.readLine();
			System.out.println("Enter Info:-");
			String j=b.readLine();
			s.setSimpleName(n);
                        		s.setSimpleInfo(j);
			System.out.println("Want to update more object YES/NO?");
			String ans=b.readLine();
			if(ans.equals("no"))
				break;
		}
		t.commit();
		session.close();
		System.out.println("Update");
	}
}