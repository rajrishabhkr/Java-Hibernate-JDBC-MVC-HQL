public class NewStudent extends Student
{
  private String quali;
  private String phone;
  public NewStudent(String sname,String email,String quali,String phone)
  {
	  super(sname,email);
	  this.quali=quali;
	  this.phone=phone;
  }

    public String getQuali() {
        return quali;
    }

    public void setQuali(String quali) {
        this.quali = quali;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}