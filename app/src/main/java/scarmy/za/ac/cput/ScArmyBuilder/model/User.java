package scarmy.za.ac.cput.ScArmyBuilder.model;

/**
 * Created by Xeno on 2015/09/27.
 */
public class User {
    private String email;
    private String userpassword;
    private String firstname;
    private String lastname;


    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getUserpassword()
    {
        return userpassword;
    }
    public void setUserpassword(String pw)
    {
        this.userpassword = pw;
    }

    public String getFirstname()
    {
        return firstname;
    }
    public void setFirstname(String firstname)
    {
        this.firstname = firstname;
    }

    public String getLastname()
    {
        return lastname;
    }
    public void setLastname(String lastname)
    {
        this.lastname = lastname;
    }

}
