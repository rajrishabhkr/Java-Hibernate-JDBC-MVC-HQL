public class Student
{
  int sid;
  String sname;
  String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
  public Student(String sname,String email)
  {
	this.sname = sname;
	this.email = email;
  }
         
}
