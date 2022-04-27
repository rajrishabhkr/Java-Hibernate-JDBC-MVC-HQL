import org.hibernate.*;
import org.hibernate.cfg.*;
public class LoginAction
{
      int id;
  String name,password;
  public LoginAction()
  {
      
  }
  public LoginAction(String name, String password)
  {
      this.name=name;
      this.password=password;
  }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
  
 
  public String getName()
  {
    return name;
  }

  public void setName(String name) 
  {
    this.name = name;
  }

  public String getPassword() 
  {
    return password;
  }

  public void setPassword(String password) 
  {
    this.password = password;
  }
  public String execute()
  {
      Configuration cfg=new Configuration().configure();
      SessionFactory sf=cfg.buildSessionFactory();
      Session ss=sf.openSession();
      Transaction tx=null;
      try
      {
        tx=ss.beginTransaction();
        LoginAction l=new LoginAction(name, password);
        ss.save(l);
        tx.commit();
      }
      catch(Exception e)
      {
          System.out.println(""+e);
      }
    if(name.startsWith("a") && password.startsWith("b"))
	return "success";
	else
	return "failure";
  }
}
