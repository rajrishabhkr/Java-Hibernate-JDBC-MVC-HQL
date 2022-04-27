public class NewStudent
{
  int sid;
  String sname;
  String email;
  String quali;
  String phone;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getQuali() {
        return quali;
    }

    public void setQuali(String quali) {
        this.quali = quali;
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
  public NewStudent(String sname,String email,String quali,String phone)
  {
	  this.sname=sname;
	  this.email=email;
	  this.quali=quali;
	  this.phone=phone;
  }
	
}
