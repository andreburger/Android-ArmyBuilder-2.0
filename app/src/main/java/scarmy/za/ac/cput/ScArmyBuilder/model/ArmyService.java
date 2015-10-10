package scarmy.za.ac.cput.ScArmyBuilder.model;

import java.util.List;

/**
 * Created by Xeno on 2015/09/27.
 */
public class ArmyService {

    private List<String> army;
    private String race;
    private String armyname;
    private String email;
    private String pop;

    public List<String> getArmy()
    {
        return army;
    }
    public void setArmy(List<String> value)
    {
        this.army = value;
    }

    public String getRace()
    {
        return race;
    }
    public void setRace(String value)
    {
        this.race = value;
    }

    public String getArmyname()
    {
        return armyname;
    }
    public void setArmyname(String value)
    {
        this.armyname = value;
    }

    public String getEmail()
    {
        return email;
    }
    public void setEmail(String value)
    {
        this.email = value;
    }

    public String getPop()
    {
        return pop;
    }
    public void setPop(String value)
    {
        this.pop = value;
    }

}
