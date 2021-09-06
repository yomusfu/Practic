package Task2;

public class Author {

    private String name;

    private char gender;

    private String email;

    Author(String name,char gender, String email) {

        this.name=name;

        this.gender=gender;

        this.email=email;
    }

    public void setEmail(String email) {
        email = email;
    }

    public void setGender(char gender) {
        gender = gender;
    }

    public void setName(String name) {
        name = name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public void ToString()
    {
        System.out.println();
        System.out.println(name+" "+gender+" at "+email);
    }
}