package Task2;

public class Author {
    private String Name;
    private char Gender;
    private String Email;
    Author(String name,char gender, String Email) {
        this.Name=name;
        this.Gender=gender;
        this.Email=Email;
    }
    public void SetName(String name)
    {
        this.Name=name;
    }
    public void SetEmail(String Email){
        this.Email=Email;
    }
    public void SetGender(char gender)
    {
        this.Gender=gender;
    }
    public String GetName()
    {
        return Name;
    }
    public String GetEmail()
    {
        return Email;
    }
    public char GetGender()
    {
        return Gender;
    }
    public void ToString()
    {
        System.out.println();
        System.out.println(Name+" "+Gender+" at "+Email);
    }
}